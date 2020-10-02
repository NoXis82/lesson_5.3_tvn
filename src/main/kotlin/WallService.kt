class WallService {
    private var postsArray = emptyArray<Post>()
    private val idPost = 345

    fun add(post: Post): Post {
        post.id = idPost
        postsArray += post
        return postsArray.last()
    }

    fun update(post: Post): Boolean {
        for ((index, posts) in postsArray.withIndex()) {
            if (post.id == posts.id) {
                postsArray[index] = posts.copy(
                        fromId = post.fromId,
                        createdBy = post.createdBy,
                        text = post.text,
                        replyOwnerId = post.replyOwnerId,
                        replyPostId = post.replyPostId,
                        friendsOnly = post.friendsOnly,
                        comments = post.comments,
                        copyright = post.copyright,
                        likes = post.likes,
                        reposts = post.reposts,
                        views = post.views,
                        postType = post.postType,
                        signerId = post.signerId,
                        canPin = post.canPin,
                        canDelete = post.canDelete,
                        canEdit = post.canEdit,
                        isPinned = post.isPinned,
                        markedAsAds = post.markedAsAds,
                        isFavorite = post.isFavorite,
                        postponedId = post.postponedId)
                return true
            }
        }
        return false
    }

}
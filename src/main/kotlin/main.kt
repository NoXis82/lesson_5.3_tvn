fun main() {
 val service = WallService()
 val post = Post(
         id = 1,
         ownerId = 0,
         fromId = 0,
         createdBy = 0,
         date = 1601510399,
         text = "this text post",
         replyOwnerId = 0,
         replyPostId = 0,
         friendsOnly = true,
         comments = Comments(count = 1, canPost = true, groupCanPost = true, canClose = false, canOpen = false),
         copyright = "copyright1",
         likes = Likes(count = 1, userLikes = true, canLike = false, canPublish = false),
         reposts = Reposts(count = 1, userReposted = false),
         views = Views(1),
         postType = "post",
         signerId = 0,
         canPin = true,
         canDelete = true,
         canEdit = true,
         isPinned = true,
         markedAsAds = true,
         isFavorite = true,
         postponedId = 1
 )
 val postUpdate = Post(
         id = 345,
         ownerId = 0,
         fromId = 0,
         createdBy = 0,
         date = 1601510500,
         text = "this update text post",
         replyOwnerId = 0,
         replyPostId = 0,
         friendsOnly = true,
         comments = Comments(count = 1, canPost = true, groupCanPost = true, canClose = false, canOpen = false),
         copyright = "copyright1",
         likes = Likes(count = 1, userLikes = true, canLike = false, canPublish = false),
         reposts = Reposts(count = 1, userReposted = false),
         views = Views(1),
         postType = "post",
         signerId = 0,
         canPin = true,
         canDelete = true,
         canEdit = true,
         isPinned = true,
         markedAsAds = true,
         isFavorite = true,
         postponedId = 1
 )
 service.add(post)
 service.update(postUpdate)

}
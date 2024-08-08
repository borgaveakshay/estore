package come.store.estore

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
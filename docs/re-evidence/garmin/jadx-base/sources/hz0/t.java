package hz0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lhz0/t;", "Lhz0/l;", "Lf12/l;", "sharedPreferences", "<init>", "(Lf12/l;)V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f86479a;

    static {
        new a(null);
    }

    public t(f12.l lVar) {
        lVar.getClass();
        this.f86479a = lVar;
    }

    @Override // hz0.l
    public final String a() {
        return this.f86479a.a0("keyNewsfeedLastViewedTimeGMT");
    }

    @Override // hz0.l
    public final void b(String str) {
        this.f86479a.S("keyNewsfeedUnreadBubbleExpirationGMT", str);
    }

    @Override // hz0.l
    public final void c(int i14) {
        this.f86479a.u2(i14, "keyNewsfeedFollowingNumber");
    }

    @Override // hz0.l
    public final void d(boolean z14) {
        this.f86479a.O2("keyIsNewsfeedUnreadBubbleRequired", z14);
    }

    public final void e(boolean z14) {
        this.f86479a.O2("keyShouldCheckNewsfeedUnreadStatus", z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lhz0/t$a;", "", "<init>", "()V", "", "USER_SHOULD_CHECK_NEWSFEED_UNREAD_STATUS", "Ljava/lang/String;", "USER_NEWSFEED_LAST_VIEWED_TIME_GMT", "USER_NEWSFEED_FOLLOWING_NUMBER", "USER_NEWSFEED_UNREAD_BUBBLE_EXPIRATION_GMT", "USER_IS_NEWSFEED_UNREAD_BUBBLE_REQUIRED", "USER_NEWS_FEED_SUGGESTED_CONNECTION_APPEARANCE_COUNT", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

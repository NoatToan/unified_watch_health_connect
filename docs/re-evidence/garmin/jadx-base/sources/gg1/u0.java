package gg1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgg1/u0;", "", "", "envName", "project", "", "isChina", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum u0 {
    FIREBASE("Firebase", "garmin-connect-mobile", false),
    GCM_PROD("GarminConnect Production", "garmin-connect-mobile", false),
    GCM_DEV("GarminConnect Development", "garmin-connect-mobile-dev", false),
    GCM_PROD_CHINA("GarminConnect Production China", "garmin-connect-mobile", true),
    GCM_DEV_CHINA("GarminConnect Development China", "garmin-connect-mobile-dev", true);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f77321d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77330c;

    u0(String str, String str2, boolean z14) {
        this.f77328a = str;
        this.f77329b = str2;
        this.f77330c = z14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/u0$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package do1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldo1/o;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f60607a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f60609b;

        static {
            int[] iArr = new int[hi0.l.b.values().length];
            try {
                iArr[hi0.l.b.FOLLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hi0.l.b.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60608a = iArr;
            int[] iArr2 = new int[hi0.e.b.values().length];
            try {
                iArr2[hi0.e.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[hi0.e.b.FOLLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f60609b = iArr2;
        }
    }

    public o(l22.b bVar) {
        bVar.getClass();
        this.f60607a = bVar;
    }

    public final String a(int i14) {
        String strA;
        if (i14 <= 0) {
            strA = null;
        } else {
            l22.b bVar = this.f60607a;
            strA = i14 == 1 ? bVar.a(R.string.lbl_comments_count_singular, Integer.valueOf(i14)) : bVar.a(R.string.lbl_comments_count, Integer.valueOf(i14));
        }
        if (strA != null) {
            return hb.a.i(strA);
        }
        return null;
    }

    public final String b(int i14, String str) {
        l22.b bVar = this.f60607a;
        if (i14 == 1) {
            return bVar.a(R.string.msg_followed_by_single_description, str);
        }
        if (i14 == 2) {
            return bVar.a(R.string.msg_followed_by_two_description, str);
        }
        if (i14 > 2) {
            return bVar.a(R.string.msg_followed_by_multiple_description, str, Integer.valueOf(i14 - 1));
        }
        return null;
    }

    public final String c(int i14, boolean z14, boolean z15) {
        l22.b bVar = this.f60607a;
        if (i14 == 0 && z15) {
            return bVar.getString(R.string.social_be_the_first_to_like);
        }
        if (i14 == 0) {
            return null;
        }
        if (i14 == 1 && z14) {
            return bVar.getString(R.string.social_liked_by_you);
        }
        if (i14 == 1) {
            return hb.a.i(bVar.a(R.string.lbl_likes_count_singular, Integer.valueOf(i14)));
        }
        if (i14 == 2 && z14) {
            return bVar.getString(R.string.social_liked_by_you_and_other);
        }
        return z14 ? bVar.a(R.string.social_liked_by_you_and_others, Integer.valueOf(i14 - 1)) : hb.a.i(bVar.a(R.string.lbl_likes_count, Integer.valueOf(i14)));
    }
}

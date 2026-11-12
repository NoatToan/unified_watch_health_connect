package y30;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import l22.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly30/a;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f194362a;

    /* JADX INFO: renamed from: y30.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3622a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194363a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.b.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.FIRST_CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.SECOND_CATEGORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.THIRD_CATEGORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.FOURTH_CATEGORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.b.HORS_CATEGORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f194363a = iArr;
        }
    }

    public a(b bVar) {
        bVar.getClass();
        this.f194362a = bVar;
    }

    public final String a(com.garmin.android.apps.connectmobile.courses.model.b bVar, boolean z14) {
        bVar.getClass();
        b bVar2 = this.f194362a;
        if (z14) {
            switch (C3622a.f194363a[bVar.ordinal()]) {
                case 1:
                    return bVar2.getString(R.string.lbl_easy_category);
                case 2:
                    return bVar2.a(R.string.lbl_abbreviated_category, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                case 3:
                    return bVar2.a(R.string.lbl_abbreviated_category, "2");
                case 4:
                    return bVar2.a(R.string.lbl_abbreviated_category, "3");
                case 5:
                    return bVar2.a(R.string.lbl_abbreviated_category, "4");
                case 6:
                    return bVar2.getString(R.string.lbl_abbreviated_hors_category);
                default:
                    return "";
            }
        }
        switch (C3622a.f194363a[bVar.ordinal()]) {
            case 1:
                return bVar2.getString(R.string.lbl_easy_category);
            case 2:
                return bVar2.a(R.string.lbl_category_number, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            case 3:
                return bVar2.a(R.string.lbl_category_number, "2");
            case 4:
                return bVar2.a(R.string.lbl_category_number, "3");
            case 5:
                return bVar2.a(R.string.lbl_category_number, "4");
            case 6:
                return bVar2.getString(R.string.lbl_abbreviated_hors_category);
            default:
                return "";
        }
    }

    public final String b(com.garmin.android.apps.connectmobile.courses.model.b bVar) {
        bVar.getClass();
        int i14 = C3622a.f194363a[bVar.ordinal()];
        b bVar2 = this.f194362a;
        switch (i14) {
            case 1:
                return bVar2.getString(R.string.lbl_easy_category);
            case 2:
                return bVar2.a(R.string.lbl_category_number, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            case 3:
                return bVar2.a(R.string.lbl_category_number, "2");
            case 4:
                return bVar2.a(R.string.lbl_category_number, "3");
            case 5:
                return bVar2.a(R.string.lbl_category_number, "4");
            case 6:
                return bVar2.getString(R.string.lbl_hors_category);
            default:
                return "";
        }
    }
}

package tm0;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;
import pk1.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltm0/f;", "Lcom/garmin/android/apps/connectmobile/draggableimagepreviewer/a$b;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f165366a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165367a;

        static {
            int[] iArr = new int[ef0.e.values().length];
            try {
                iArr[ef0.e.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ef0.e.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ef0.e.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f165367a = iArr;
        }
    }

    public f(c cVar) {
        this.f165366a = cVar;
    }

    @Override // com.garmin.android.apps.connectmobile.draggableimagepreviewer.a.b
    public final void a(ef0.b bVar) {
        int i14 = a.f165367a[bVar.f63940b.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return;
        }
        if (i14 != 3) {
            u0.r();
        } else {
            c cVar = this.f165366a;
            new androidx.appcompat.app.e.a(cVar.requireContext()).setTitle(R.string.social_group_upload_failed).setMessage(R.string.social_upload_failed_message).setPositiveButton(R.string.lbl_retry, new t(7, cVar, bVar)).setNegativeButton(R.string.lbl_cancel, new qh1.j(19)).show();
        }
    }
}

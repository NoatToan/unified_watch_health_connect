package wr2;

import android.view.View;
import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface v<ViewType extends View> extends Serializable {
    public static final a C0 = a.f186889a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwr2/v$a;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f186889a = new a();

        /* JADX INFO: renamed from: wr2.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwr2/v$a$a;", "Lwr2/v;", "Landroid/view/View;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3480a implements v<View> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3480a f186890a = new C3480a();

            private C3480a() {
            }

            @Override // wr2.v
            public final void x0(View view2) {
                view2.getClass();
                view2.setVisibility(8);
            }
        }

        private a() {
        }
    }

    void x0(ViewType viewtype);
}

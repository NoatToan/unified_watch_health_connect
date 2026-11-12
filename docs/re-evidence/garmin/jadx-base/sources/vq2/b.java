package vq2;

import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import au0.g;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ta0.j;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
public interface b extends d {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f179457y0 = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvq2/b$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f179458a;

        static {
            new a();
            int i14 = gt2.c.f79010a;
            f179458a = gt2.b.f79005a.h("PAY#DialogSupport");
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vq2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.unionpay.ui.plugin.DialogSupport$showDialog$1", f = "DialogSupport.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3349b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<androidx.appcompat.app.e.a, Unit> f179460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3349b(l<? super androidx.appcompat.app.e.a, Unit> lVar, t13.d<? super C3349b> dVar) {
            super(2, dVar);
            this.f179460b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3349b(this.f179460b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3349b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a.f179458a.trace("showDialog()");
            b.this.U2(this.f179460b).show();
            return Unit.INSTANCE;
        }
    }

    static {
        Logger logger = a.f179458a;
    }

    default void J3(l<? super DialogInterface, Unit> lVar) {
        a.f179458a.trace("showCommonErrorDialog()");
        Z5(new j(lVar, 19));
    }

    default androidx.appcompat.app.e U2(l lVar) {
        lVar.getClass();
        a.f179458a.trace("createDialog()");
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(new ContextThemeWrapper(M(), R.style.AlertDialogTheme));
        lVar.invoke(aVar);
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        return eVarCreate;
    }

    default void Z5(l<? super androidx.appcompat.app.e.a, Unit> lVar) {
        gl.b.I(f0.w(M()), null, new C3349b(lVar, null), 3);
    }

    default void h4(l lVar, String str) {
        a.f179458a.trace("showDeviceBusyErrorDialog()");
        Z5(new g(str, lVar, 8));
    }

    default void s5(String str, String str2, l<? super DialogInterface, Unit> lVar) {
        str.getClass();
        a.f179458a.trace("showCommonErrorDialogWithCardName()");
        Z5(new vq2.a(str, 0, str2, lVar));
    }

    default void u1(l lVar, long j8, String str) {
        a.f179458a.trace("showDeviceNotConnectedErrorDialog()");
        Z5(new c31.e(str, lVar, j8, 9));
    }
}

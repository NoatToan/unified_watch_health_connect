package ir2;

import android.R;
import android.widget.ArrayAdapter;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import e23.p;
import en0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import ps2.n;
import ps2.w;
import rd2.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$promptDialogForPickingDevice$1", f = "WalletMessageConsoleActivity.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WalletMessageConsoleActivity f94854b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity$promptDialogForPickingDevice$1$devices$1", f = "WalletMessageConsoleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super List<? extends Long>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WalletMessageConsoleActivity f94855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94855a = walletMessageConsoleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94855a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends Long>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            WalletMessageConsoleActivity.a aVar2 = WalletMessageConsoleActivity.f51900i;
            this.f94855a.getClass();
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListD = j.d();
            if (arrayListD == null) {
                o2.c.m("Null return from DeviceDAO.getInstance().retriever.all()");
                return null;
            }
            ArrayList arrayList = new ArrayList(y.r(arrayListD, 10));
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((sd2.f) it.next()).getUnitID()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                long jLongValue = ((Number) obj2).longValue();
                w.f140538a.getClass();
                n nVarI = w.i(jLongValue);
                if ((nVarI != null ? nVarI.h() : null) == hs2.b.READY) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WalletMessageConsoleActivity walletMessageConsoleActivity, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f94854b = walletMessageConsoleActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f94854b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94853a;
        int i15 = 1;
        WalletMessageConsoleActivity walletMessageConsoleActivity = this.f94854b;
        try {
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(walletMessageConsoleActivity, null);
                this.f94853a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(walletMessageConsoleActivity, R.layout.simple_dropdown_item_1line, (List) obj);
            new androidx.appcompat.app.e.a(walletMessageConsoleActivity).setAdapter(arrayAdapter, new hg1.g(11, walletMessageConsoleActivity, arrayAdapter)).setOnCancelListener(new m(walletMessageConsoleActivity, i15)).setCancelable(false).show();
        } catch (Throwable th3) {
            WalletMessageConsoleActivity.f51901j.error("Failed to show all NFC connected devices", th3);
            new androidx.appcompat.app.e.a(walletMessageConsoleActivity).setTitle("Error").setMessage(d53.n.c("\n                    Failed to show all NFC connected devices\n                    -\n                    " + th3 + "\n                    ")).setPositiveButton(com.garmin.android.apps.connectmobile.R.string.lbl_ok, new b(walletMessageConsoleActivity, 2)).show();
            walletMessageConsoleActivity.finish();
        }
        return Unit.INSTANCE;
    }
}

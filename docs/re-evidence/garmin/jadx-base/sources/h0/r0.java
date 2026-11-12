package h0;

import am.x0;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import b0.g1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeMainFragment;
import com.garmin.android.apps.connectmobile.developer.realtimedata.TestRealTimeDataActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.w4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f80554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80555c;

    public /* synthetic */ r0(int i14, Object obj, Object obj2) {
        this.f80553a = i14;
        this.f80554b = obj;
        this.f80555c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        b0.l0.g gVar = null;
        Object[] objArr3 = 0;
        switch (this.f80553a) {
            case 0:
                ((t0) this.f80554b).f80577e.remove((k0) this.f80555c);
                return;
            case 1:
                v0 v0Var = (v0) this.f80554b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.f80555c;
                i15 = v0Var.d() == null ? 0 : 1;
                v0Var.f();
                if (i15 == 0) {
                    vb.h.z("One and only one callback is allowed.");
                    return;
                }
                b0.l0.f fVarD = v0Var.d();
                Objects.requireNonNull(fVarD);
                fVarD.c(imageCaptureException);
                return;
            case 2:
                v0 v0Var2 = (v0) this.f80554b;
                androidx.camera.core.e eVar = (androidx.camera.core.e) this.f80555c;
                b0.l0.f fVarD2 = v0Var2.d();
                Objects.requireNonNull(fVarD2);
                Objects.requireNonNull(eVar);
                fVarD2.b(eVar);
                return;
            case 3:
                v0 v0Var3 = (v0) this.f80554b;
                b0.l0.i iVar = (b0.l0.i) this.f80555c;
                v0Var3.f();
                Objects.requireNonNull(null);
                Objects.requireNonNull(iVar);
                gVar.b();
                return;
            case 4:
                hc0.b.ViewOnClickListenerC1638b viewOnClickListenerC1638b = (hc0.b.ViewOnClickListenerC1638b) this.f80554b;
                gc0.e eVar2 = (gc0.e) this.f80555c;
                if (eVar2.f76847c == gc0.f.INITIATED) {
                    eVar2.a(gc0.f.NONE);
                    viewOnClickListenerC1638b.f83219a.notifyDataSetChanged();
                    return;
                }
                return;
            case 5:
                ((hd1.d) this.f80554b).a((hd1.m) this.f80555c);
                return;
            case 6:
                ((hd1.e) this.f80554b).a((hd1.o) this.f80555c);
                return;
            case 7:
                ((hd1.f) this.f80554b).a((hd1.y) this.f80555c);
                return;
            case 8:
                ((hd1.h) this.f80554b).a((hd1.c0) this.f80555c);
                return;
            case 9:
                ((hd1.i) this.f80554b).a((hd1.e0) this.f80555c);
                return;
            case 10:
                ((hd1.j) this.f80554b).a((hd1.g0) this.f80555c);
                return;
            case 11:
                ((hd1.k) this.f80554b).a((hd1.i0) this.f80555c);
                return;
            case 12:
                i.e.c cVar = (i.e.c) this.f80554b;
                try {
                    ((Runnable) this.f80555c).run();
                    return;
                } finally {
                    cVar.a();
                }
            case 13:
                w4 w4Var = (w4) this.f80554b;
                androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) this.f80555c;
                if (w4Var.f91636c) {
                    return;
                }
                w4Var.f91637d = b0Var;
                b0Var.a(w4Var);
                return;
            case 14:
                View view2 = (View) this.f80554b;
                List<i80.a.b> list = (List) this.f80555c;
                int i17 = i80.a.f92217a;
                RecyclerView.h adapter = ((RecyclerView) view2).getAdapter();
                adapter.getClass();
                i80.a.c cVar2 = (i80.a.c) adapter;
                list.getClass();
                cVar2.f92222c = list;
                cVar2.notifyDataSetChanged();
                return;
            case 15:
                ArrayList arrayList = (ArrayList) this.f80554b;
                id1.c cVar3 = (id1.c) this.f80555c;
                Iterator<Integer> it = new j23.l(0, arrayList.size()).iterator();
                while (((j23.k) it).f96801c) {
                    int iNextInt = ((p13.p0) it).nextInt();
                    RecyclerView recyclerView = cVar3.f93021g;
                    RecyclerView.f0 f0VarFindViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(iNextInt) : null;
                    id1.c.AbstractC1775c abstractC1775c = f0VarFindViewHolderForAdapterPosition instanceof id1.c.AbstractC1775c ? (id1.c.AbstractC1775c) f0VarFindViewHolderForAdapterPosition : null;
                    if (abstractC1775c != null) {
                        abstractC1775c.f();
                    }
                }
                return;
            case 16:
                j0.q.p((j0.q) this.f80554b, (androidx.lifecycle.s0) this.f80555c);
                return;
            case 17:
                v.b0 b0Var2 = (v.b0) this.f80554b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f80555c;
                try {
                    b0Var2.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 18:
                j1.k.this.f96271o.a((g1) this.f80555c);
                return;
            case 19:
                j1.z zVar = (j1.z) this.f80554b;
                g1 g1Var = (g1) this.f80555c;
                g1 g1Var2 = zVar.f96334h;
                if (g1Var2 != null && g1Var2 == g1Var) {
                    zVar.f96334h = null;
                    zVar.f96333g = null;
                }
                a73.f fVar = zVar.f96338l;
                if (fVar != null) {
                    fVar.a();
                    zVar.f96338l = null;
                    return;
                }
                return;
            case 20:
                ((com.garmin.android.apps.connectmobile.connections.groups.details.a) ((GroupActivityFeedTypeMainFragment) this.f80554b).f31373b.getValue()).x4(new com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a((x0) this.f80555c, objArr == true ? 1 : 0, i14, objArr3 == true ? 1 : 0), false);
                return;
            case 21:
                j4.a aVar = (j4.a) this.f80554b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f80555c;
                j4.a.c.f96981a.getClass();
                j4.a.c.a(aVar, longSparseArray);
                return;
            case 22:
                ((TestRealTimeDataActivity) this.f80554b).f33673c.setText(((xm2.j) this.f80555c).name());
                return;
            case 23:
                gi2.c cVar4 = (gi2.c) this.f80554b;
                lh2.u uVar = (lh2.u) this.f80555c;
                int i18 = jh2.a.f98756e;
                gi2.b bVar = (gi2.b) cVar4;
                if (!bVar.t()) {
                    uVar.e(false);
                    return;
                }
                uVar.e(true);
                if (bVar.s()) {
                    uVar.d();
                    return;
                }
                return;
            case 24:
                FitPayCardVerificationActivity fitPayCardVerificationActivity = (FitPayCardVerificationActivity) this.f80554b;
                FitPayCardVerificationActivity.a aVar2 = (FitPayCardVerificationActivity.a) this.f80555c;
                FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
                fitPayCardVerificationActivity.ca().debug("showAlertDialog: " + aVar2);
                if (aVar2 instanceof FitPayCardVerificationActivity.a.f) {
                    String string = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                    string.getClass();
                    String string2 = fitPayCardVerificationActivity.getString(R.string.verification_failed);
                    string2.getClass();
                    String string3 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                    string3.getClass();
                    androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string, string2, new o13.p(string3, new jp2.a(fitPayCardVerificationActivity, 7)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ != null) {
                        eVarQ.show();
                        return;
                    }
                    return;
                }
                if (aVar2 instanceof FitPayCardVerificationActivity.a.d) {
                    String string4 = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                    string4.getClass();
                    String string5 = fitPayCardVerificationActivity.getString(R.string.incorrect_code);
                    string5.getClass();
                    String string6 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                    string6.getClass();
                    androidx.appcompat.app.e eVarQ2 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string4, string5, new o13.p(string6, new jp2.a(fitPayCardVerificationActivity, i14)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ2 != null) {
                        eVarQ2.show();
                        return;
                    }
                    return;
                }
                if (aVar2 instanceof FitPayCardVerificationActivity.a.C1067a) {
                    String str = ((FitPayCardVerificationActivity.a.C1067a) aVar2).f51456a;
                    String string7 = fitPayCardVerificationActivity.getString(R.string.wallet_title_app_not_installed);
                    string7.getClass();
                    String string8 = fitPayCardVerificationActivity.getString(R.string.wallet_install_app);
                    string8.getClass();
                    String string9 = fitPayCardVerificationActivity.getString(R.string.os_app_store_android);
                    string9.getClass();
                    String string10 = fitPayCardVerificationActivity.getString(R.string.lbl_cancel);
                    string10.getClass();
                    androidx.appcompat.app.e eVarQ3 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string7, string8, new o13.p(string9, new i20.b(20, fitPayCardVerificationActivity, str)), new o13.p(string10, new jp2.a(fitPayCardVerificationActivity, 5)), null, false, 224);
                    if (eVarQ3 != null) {
                        eVarQ3.show();
                        return;
                    }
                    return;
                }
                if (aVar2 instanceof FitPayCardVerificationActivity.a.h) {
                    fitPayCardVerificationActivity.fa(((FitPayCardVerificationActivity.a.h) aVar2).f51463a);
                    return;
                }
                if (aVar2 instanceof FitPayCardVerificationActivity.a.c) {
                    String string11 = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                    string11.getClass();
                    String string12 = fitPayCardVerificationActivity.getString(R.string.exceeded_code_retries);
                    string12.getClass();
                    String string13 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                    string13.getClass();
                    androidx.appcompat.app.e eVarQ4 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string11, string12, new o13.p(string13, new jp2.a(fitPayCardVerificationActivity, i15)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ4 != null) {
                        eVarQ4.show();
                        return;
                    }
                    return;
                }
                if (aVar2 instanceof FitPayCardVerificationActivity.a.b) {
                    String string14 = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                    string14.getClass();
                    String string15 = fitPayCardVerificationActivity.getString(R.string.expired_code);
                    string15.getClass();
                    String string16 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                    string16.getClass();
                    androidx.appcompat.app.e eVarQ5 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string14, string15, new o13.p(string16, new jp2.a(fitPayCardVerificationActivity, 3)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ5 != null) {
                        eVarQ5.show();
                        return;
                    }
                    return;
                }
                if (!(aVar2 instanceof FitPayCardVerificationActivity.a.e)) {
                    if (!p005kotlin.jvm.internal.s.g(aVar2, FitPayCardVerificationActivity.a.g.f51462a)) {
                        lc.u0.r();
                        return;
                    }
                    String string17 = fitPayCardVerificationActivity.getString(R.string.dialog_title_error);
                    string17.getClass();
                    String string18 = fitPayCardVerificationActivity.getString(R.string.verifications_load_error);
                    string18.getClass();
                    String string19 = fitPayCardVerificationActivity.getString(R.string.lbl_ok);
                    string19.getClass();
                    androidx.appcompat.app.e eVarQ6 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string17, string18, new o13.p(string19, new jp2.a(fitPayCardVerificationActivity, 4)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                    if (eVarQ6 != null) {
                        eVarQ6.show();
                        return;
                    }
                    return;
                }
                String string20 = fitPayCardVerificationActivity.getString(R.string.wallet_remove_card);
                string20.getClass();
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String string21 = fitPayCardVerificationActivity.getString(R.string.wallet_remove_card_from_watch_confirmation);
                string21.getClass();
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = fitPayCardVerificationActivity.f51455l;
                if (aVar3 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                String strA0 = aVar3.y4().getShortDescription();
                if (strA0 == null) {
                    strA0 = "";
                }
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayCardVerificationActivity.f51455l;
                if (aVar4 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                String str2 = String.format(string21, Arrays.copyOf(new Object[]{strA0, aVar4.z4().f205819e.f205629a.f73104d}, 2));
                String string22 = fitPayCardVerificationActivity.getString(R.string.lbl_remove);
                string22.getClass();
                String string23 = fitPayCardVerificationActivity.getString(R.string.lbl_cancel);
                string23.getClass();
                androidx.appcompat.app.e eVarQ7 = br2.c.q(br2.c.f19585a, fitPayCardVerificationActivity, string20, str2, new o13.p(string22, new jp2.a(fitPayCardVerificationActivity, i16)), new o13.p(string23, new in2.e(objArr2 == true ? 1 : 0, 19)), null, false, 224);
                if (eVarQ7 != null) {
                    eVarQ7.show();
                    return;
                }
                return;
            case 25:
                ((js0.a) this.f80554b).f100600h.highlightValue((es0.h) this.f80555c);
                return;
            case 26:
                k9.d dVar = (k9.d) this.f80554b;
                SettableFuture settableFuture = (SettableFuture) this.f80555c;
                synchronized (dVar.f103416a) {
                    dVar.f103416a.remove(settableFuture);
                    break;
                }
                return;
            case 27:
                androidx.media3.exoplayer.audio.b.a aVar5 = (androidx.media3.exoplayer.audio.b.a) this.f80554b;
                String str3 = (String) this.f80555c;
                androidx.media3.exoplayer.audio.b bVar3 = aVar5.f8767b;
                int i19 = fa.z.f70071a;
                bVar3.onAudioDecoderReleased(str3);
                return;
            case 28:
                AudioSink.b bVar4 = (AudioSink.b) this.f80554b;
                AudioSink.a aVar6 = (AudioSink.a) this.f80555c;
                androidx.media3.exoplayer.audio.b.a aVar7 = androidx.media3.exoplayer.audio.f.this.A1;
                Handler handler = aVar7.f8766a;
                if (handler != null) {
                    handler.post(new ka.e(aVar7, aVar6, i15));
                    return;
                }
                return;
            default:
                PlayerView.a((PlayerView) this.f80554b, (Bitmap) this.f80555c);
                return;
        }
    }
}

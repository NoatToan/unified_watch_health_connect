package hy;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.m1;
import androidx.core.view.z;
import androidx.lifecycle.v1;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b0.l1;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationListFragment;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.fragment.FitPayCardVerificationSubmitFragment;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.common.util.concurrent.SettableFuture;
import com.google.maps.android.BuildConfig;
import ds.e0;
import j20.x;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import lo.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.y0;
import p007l6.a0;
import r22.a2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements z, q1.a, u03.d, u03.a, k1.a.b, j9.e, ImageAssetDelegate, gu.e, androidx.media3.exoplayer.audio.a.e, MultiLineImeEditText.b, n83.b, l52.u, SwipeRefreshLayout.f, a2.d, RPESeekBar.b, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f86323b;

    public /* synthetic */ d(Object obj, int i14) {
        this.f86322a = i14;
        this.f86323b = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void M7() {
        int i14 = this.f86322a;
        Object obj = this.f86323b;
        switch (i14) {
            case 21:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.C0772a c0772a = com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a.f40930t;
                ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.a) obj).H6().A4();
                return;
            default:
                FitPayCardVerificationListFragment fitPayCardVerificationListFragment = (FitPayCardVerificationListFragment) obj;
                RecyclerView recyclerView = fitPayCardVerificationListFragment.f51506c;
                if (recyclerView == null) {
                    p005kotlin.jvm.internal.s.m("recyclerView");
                    throw null;
                }
                if (recyclerView.getItemAnimator() == null) {
                    RecyclerView recyclerView2 = fitPayCardVerificationListFragment.f51506c;
                    if (recyclerView2 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView2.setItemAnimator(new androidx.recyclerview.widget.i());
                }
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = fitPayCardVerificationListFragment.f51505b;
                if (aVar != null) {
                    ge1.b.T(v1.a(aVar), s0.f129406a, null, new jp2.h(aVar, null), 2);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar.b
    public void a(int i14) {
        f0 f0Var = (f0) this.f86323b;
        f0Var.f113838w1.setText(f0Var.f113814o2.a(Integer.valueOf(i14)));
        if (i14 != 0) {
            f0Var.B1 = i14;
        } else {
            f0Var.B1 = -2;
        }
        f0.d dVar = f0Var.C1;
        if (dVar != null) {
            ((lo.t) dVar).w6();
        }
    }

    @Override // u03.d
    public void accept(Object obj) {
        int i14 = this.f86322a;
        Object obj2 = this.f86323b;
        switch (i14) {
            case 3:
                GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
                ((ho0.g) obj2).invoke(obj);
                break;
            case 8:
                String str = DeveloperSettingsActivity.f51946n;
                ((jr2.c) obj2).invoke(obj);
                break;
            case 9:
                String str2 = DeveloperSettingsActivity.f51946n;
                ((jr2.c) obj2).invoke(obj);
                break;
            case 16:
                kr2.h.a aVar2 = kr2.h.f106255y;
                ((kr2.f) obj2).invoke(obj);
                break;
            case 24:
                ((FitPayCardVerificationListFragment.b) obj2).invoke(obj);
                break;
            case 25:
                ((lp2.e) obj2).invoke(obj);
                break;
            case 27:
                int i15 = FitPayCardVerificationSubmitFragment.f51514k;
                ((FitPayCardVerificationSubmitFragment.c) obj2).invoke(obj);
                break;
            default:
                int i16 = FitPayCardVerificationSubmitFragment.f51514k;
                ((lp2.g) obj2).invoke(obj);
                break;
        }
    }

    @Override // j9.e
    public void b(IInterface iInterface, SettableFuture settableFuture) {
        ((e0) ((j9.f) this.f86323b)).getClass();
        settableFuture.set(Integer.valueOf(((p9.l) iInterface).G()));
    }

    @Override // androidx.media3.exoplayer.audio.a.e
    public void c(ka.a aVar) {
        u0.a aVar2;
        boolean z14;
        androidx.media3.exoplayer.z zVar;
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink) this.f86323b;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = defaultAudioSink.f8688f0;
        if (looper != looperMyLooper) {
            vb.h.z(v.e0.g("Current looper (", looperMyLooper == null ? BuildConfig.TRAVIS : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? BuildConfig.TRAVIS : looper.getThread().getName(), ")"));
            return;
        }
        if (aVar.equals(defaultAudioSink.f8708w)) {
            return;
        }
        defaultAudioSink.f8708w = aVar;
        androidx.media3.exoplayer.audio.f.b bVar = defaultAudioSink.f8703r;
        if (bVar != null) {
            androidx.media3.exoplayer.audio.f fVar = androidx.media3.exoplayer.audio.f.this;
            synchronized (fVar.f8921a) {
                aVar2 = fVar.f8937q;
            }
            if (aVar2 != null) {
                wa.e eVar = (wa.e) aVar2;
                synchronized (eVar.f183653d) {
                    z14 = eVar.f183657h.f183699w0;
                }
                if (!z14 || (zVar = eVar.f183753a) == null) {
                    return;
                }
                zVar.f9893i.sendEmptyMessage(26);
            }
        }
    }

    @Override // n83.b
    public void call(Object obj) {
        ((iz1.f) this.f86323b).invoke(obj);
    }

    public void d(k1.a.c cVar) {
        j1.k kVar = (j1.k) this.f86323b;
        if (!(cVar instanceof k1.a.c.C1961c)) {
            j1.k.c cVar2 = j1.k.f96256p;
            return;
        }
        j1.b bVar = kVar.f96264h;
        if (bVar != null) {
            float f14 = ((k1.a.c.C1961c) cVar).f102141a;
            if (bVar.j() && bVar.f96221t) {
                j0.u.a();
                l1 l1VarD = bVar.f96224w.d();
                if (l1VarD == null) {
                    return;
                }
                bVar.n(Math.min(Math.max(l1VarD.b() * (f14 > 1.0f ? x.a(f14, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f14) * 2.0f)), l1VarD.d()), l1VarD.c()));
            }
        }
    }

    public float e(float f14) {
        return ((a0) this.f86323b).f110439k.getF69050b() * f14;
    }

    @Override // gu.e
    public void f(Serializable serializable) {
        dt2.k kVar = (dt2.k) this.f86323b;
        boolean zBooleanValue = ((Boolean) serializable).booleanValue();
        int i14 = ju.a.f100865c;
        ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        GDIAudioPromptsProto.AudioPromptsService.Builder setLanguageResponse = GDIAudioPromptsProto.AudioPromptsService.newBuilder().setSetLanguageResponse(GDIAudioPromptsProto.SetLanguageResponse.newBuilder().setSuccess(zBooleanValue));
        setLanguageResponse.getClass();
        GDISmartProto.Smart smartBuild = companion.setAudioPromptsService(builderNewBuilder, setLanguageResponse).build();
        smartBuild.getClass();
        companion.sendResponse(smartBuild, kVar, null);
    }

    @Override // com.airbnb.lottie.ImageAssetDelegate
    public Bitmap fetchBitmap(LottieImageAsset lottieImageAsset) {
        Map map = (Map) this.f86323b;
        com.garmin.android.apps.connectmobile.topoactivemaps.a.C0862a c0862a = com.garmin.android.apps.connectmobile.topoactivemaps.a.f45072e;
        return (Bitmap) map.get(lottieImageAsset.getFileName());
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f86322a;
        Object obj = this.f86323b;
        switch (i14) {
            case 1:
                i20.h hVar = (i20.h) obj;
                EditContactActivity.a aVar = EditContactActivity.f32500n;
                if (z14) {
                    hVar.invoke();
                }
                break;
            case 2:
                i20.h hVar2 = (i20.h) obj;
                EditContactActivity.a aVar2 = EditContactActivity.f32500n;
                if (z14) {
                    hVar2.invoke();
                }
                break;
            case 6:
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) obj;
                int i15 = GroupSettingsActivity.f31420z;
                if (z14) {
                    groupSettingsActivity.finish();
                }
                break;
            default:
                CreateCourseActivity.ca((CreateCourseActivity) obj, z14);
                break;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b bVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.pregnancyhistory.b) this.f86323b;
        db1.m mVar = bVar.f40916i;
        if (mVar == null) {
            p005kotlin.jvm.internal.s.m("mPregnancySnapshotDTO");
            throw null;
        }
        MultiLineImeEditText multiLineImeEditText = bVar.f40914g;
        if (multiLineImeEditText == null) {
            p005kotlin.jvm.internal.s.m("mPregnancyNotesEditTextButton");
            throw null;
        }
        mVar.y(String.valueOf(multiLineImeEditText.getText()));
        androidx.fragment.app.m activity = bVar.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        lo.i iVar = (lo.i) this.f86323b;
        lo.i.a aVar = iVar.Y0;
        if (aVar != null) {
            lo.i.b bVar = iVar.U0;
            if (bVar == lo.i.b.PACE || bVar == lo.i.b.SWIM_PACE) {
                aVar.j((i14 * 60) + i15);
            } else {
                aVar.j((((double) i15) / 10.0d) + ((double) i14));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Integer] */
    @Override // l52.u
    public void o(l52.i.a aVar) {
        switch (this.f86322a) {
            case 18:
                l52.q qVar = (l52.q) this.f86323b;
                qVar.f110337a = Integer.valueOf(Math.max(((Number) qVar.f110337a).intValue(), aVar.getDepth()));
                break;
            default:
                HashSet hashSet = (HashSet) this.f86323b;
                y0.a(hashSet).remove(aVar.getParent());
                if (aVar.f()) {
                    hashSet.add(aVar);
                }
                break;
        }
    }

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        CalendarDetailsActivity calendarDetailsActivity = (CalendarDetailsActivity) this.f86323b;
        CalendarDetailsActivity.b bVar = CalendarDetailsActivity.f31194p;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(647);
        eVarI.getClass();
        int i14 = eVarI.f25193d;
        if (calendarDetailsActivity.getResources().getConfiguration().orientation != 2) {
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i14);
            return m1Var;
        }
        view2.setPadding(eVarI.f25190a, eVarI.f25191b, eVarI.f25192c, i14);
        return m1Var;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        lp2.g gVar = (lp2.g) this.f86323b;
        int i14 = FitPayCardVerificationSubmitFragment.f51514k;
        gVar.invoke(obj);
    }

    @Override // u03.a
    public void run() {
        switch (this.f86322a) {
            case 4:
                ((GarminPayLaunchScreenActivity) this.f86323b).f35306a.debug("Complete updating onboarding statuses.");
                break;
            default:
                ((kr2.h) this.f86323b).f106277w.m(Boolean.FALSE);
                Toast.makeText(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), "All local wallet items deleted successfully!", 0).show();
                break;
        }
    }
}

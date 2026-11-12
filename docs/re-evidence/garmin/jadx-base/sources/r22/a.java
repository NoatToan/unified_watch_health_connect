package r22;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.ActivityDiveEditGasesActivity;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.android.apps.connectmobile.view.audiorecording.WaveformView;
import com.garmin.realtimesettings.app.deeplinking.ConnectIQAppIntroActivity;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.chartingv2.formatter.FillFormatter;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import linc.com.amplituda.AmplitudaResult;
import linc.com.amplituda.callback.AmplitudaSuccessListener;
import lo.l3;
import lo.n3;
import okhttp3.ResponseBody;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements q1.d, r1.d, l7.h, a2.d, MultiLineImeEditText.b, xz2.p, id1.b.a, com.garmin.android.library.mapsdkadapter.i.k, rv.a.b, AmplitudaSuccessListener, androidx.media3.exoplayer.source.n.a, FillFormatter, androidx.core.view.z, c83.h, ImageAssetDelegate, IFillFormatter, u03.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f149546b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f149545a = i14;
        this.f149546b = obj;
    }

    @Override // r22.q1.d
    public void a(int i14, double d14, l3 l3Var) {
        switch (this.f149545a) {
            case 0:
                lo.m mVar = ((b) this.f149546b).f149583r;
                if (mVar != null) {
                    l3Var.getClass();
                    lo.t tVar = mVar.f113910b;
                    tVar.f113949a.L0(i14, (int) d14, l3Var);
                    tVar.w6();
                }
                break;
            default:
                lo.m mVar2 = ((c) this.f149546b).f149623r;
                if (mVar2 != null) {
                    l3Var.getClass();
                    lo.t tVar2 = mVar2.f113910b;
                    tVar2.f113949a.L0(i14, 0, l3Var);
                    tVar2.w6();
                }
                break;
        }
    }

    @Override // u03.f
    /* JADX INFO: renamed from: apply */
    public Object mo330apply(Object obj) {
        int i14 = this.f149545a;
        Object obj2 = this.f149546b;
        switch (i14) {
            case 20:
                Logger logger = tn2.w.f165679d;
                obj.getClass();
                return (List) ((aq1.d0) obj2).invoke(obj);
            case 21:
                Logger logger2 = tn2.w.f165679d;
                obj.getClass();
                return (List) ((aq1.d0) obj2).invoke(obj);
            case 22:
                Logger logger3 = tn2.w.f165679d;
                obj.getClass();
                return (q03.v) ((sy.i) obj2).invoke(obj);
            case 23:
                Logger logger4 = tn2.w.f165679d;
                obj.getClass();
                return (q03.v) ((rp.b) obj2).invoke(obj);
            case 24:
                Logger logger5 = tn2.w.f165679d;
                obj.getClass();
                return (q03.k) ((rp.b) obj2).invoke(obj);
            case 25:
                Logger logger6 = tn2.w.f165679d;
                obj.getClass();
                return (byte[]) ((t52.c) obj2).invoke(obj);
            case 26:
                Logger logger7 = tn2.w.f165679d;
                obj.getClass();
                return (byte[]) ((t52.c) obj2).invoke(obj);
            case 27:
                Logger logger8 = tn2.w.f165679d;
                obj.getClass();
                return (Integer) ((tn2.l) obj2).invoke(obj);
            case 28:
                Logger logger9 = tn2.w.f165679d;
                obj.getClass();
                return (Boolean) ((tn2.m) obj2).invoke(obj);
            default:
                Logger logger10 = tn2.w.f165679d;
                obj.getClass();
                return (Boolean) ((tn2.m) obj2).invoke(obj);
        }
    }

    @Override // xz2.p
    public void b(MaterialCalendarView materialCalendarView, xz2.b bVar) {
        rb1.f fVar = (rb1.f) this.f149546b;
        int i14 = rb1.f.f151604h;
        bVar.getClass();
        rb1.g gVarV6 = fVar.v6();
        Date dateG = bVar.g();
        dateG.getClass();
        gVarV6.f151623d = dateG;
        materialCalendarView.f();
    }

    @Override // rv.a.b
    public void c() {
        rv.a aVar = (rv.a) this.f149546b;
        if (aVar.getActivity() != null) {
            aVar.getActivity().onBackPressed();
        }
    }

    @Override // c83.h
    public Object convert(Object obj) throws IOException {
        List list;
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.i2.a aVar;
        com.garmin.android.apps.connectmobile.a2 a2Var;
        String message;
        String str;
        com.garmin.android.library.mapsdkadapter.i.b bVar = (com.garmin.android.library.mapsdkadapter.i.b) this.f149546b;
        String strString = ((ResponseBody) obj).string();
        t20.b.f161764c.getClass();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = new com.garmin.android.apps.connectmobile.courses.model.e();
        if (strString != null && !TextUtils.isEmpty(strString) && strString.length() > 2) {
            t20.f fVar = t20.f.f161772a;
            String strV = d53.u.v(d53.u.v(strString, "[", "", false), "]", "", false);
            t20.f.f161772a.getClass();
            String strM = strV.length() == 0 ? null : am.j.m("[", strV, "]");
            if (strM == null || strM.length() == 0) {
                list = null;
            } else {
                try {
                    list = (List) new Gson().fromJson(strM, new t20.g().getType());
                } catch (JsonSyntaxException e4) {
                    aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2Var = com.garmin.android.apps.connectmobile.a2.COURSES;
                    message = e4.getMessage();
                    str = "Syntax error parsing json response: ";
                    sn.a.s(str, message, aVar, a2Var, "CourseOperationsUtil");
                    list = null;
                } catch (JsonParseException e14) {
                    aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2Var = com.garmin.android.apps.connectmobile.a2.COURSES;
                    message = e14.getMessage();
                    str = "Error parsing json response: ";
                    sn.a.s(str, message, aVar, a2Var, "CourseOperationsUtil");
                    list = null;
                }
            }
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList<List> arrayListI1 = p13.h0.i1(list, 3, 3, true);
                arrayList = new ArrayList();
                for (List list2 : arrayListI1) {
                    Double d14 = (Double) p13.h0.e0(0, list2);
                    Double d15 = (Double) p13.h0.e0(1, list2);
                    GeoPointDTO geoPointDTO = (d14 == null || d15 == null) ? null : new GeoPointDTO(d14.doubleValue(), d15.doubleValue(), (Double) p13.h0.e0(2, list2));
                    if (geoPointDTO != null) {
                        arrayList.add(geoPointDTO);
                    }
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                eVar.J0((GeoPointDTO) arrayList.get(0));
                eVar.g0(bVar);
                t20.f.a(arrayList, eVar);
                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                s20.d dVar = s20.d.f156005a;
                List<GeoPointDTO> list3 = eVar.geoPoints;
                dVar.getClass();
                eVar.intervalMarkers = s20.d.f(list3, zY);
            }
        }
        return eVar;
    }

    @Override // r22.r1.d
    public void d(int i14, int i15, String str) {
        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.c cVar = ((f) this.f149546b).T;
        if (cVar != null) {
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVar = cVar.f28899a;
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = cVar.f28900b;
            Context context = eVar.getContext();
            double d14 = i14;
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.a aVar = cVar.f28901c;
            dVar.getClass();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c cVar2 = dVar.f28864b;
            if (cVar2 != null) {
                int i16 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c.b.f28860b[aVar.ordinal()];
                if (i16 == 1) {
                    cVar2.r(d14);
                } else if (i16 == 2) {
                    cVar2.p(d14);
                } else {
                    if (i16 != 3) {
                        lc.u0.r();
                        return;
                    }
                    cVar2.m(d14);
                }
            }
            dVar.N4(context);
            com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.a aVar2 = com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i;
            eVar.z6(dVar, aVar);
        }
    }

    @Override // com.airbnb.lottie.ImageAssetDelegate
    public Bitmap fetchBitmap(LottieImageAsset lottieImageAsset) {
        return ((tb0.x) this.f149546b).f163726c.get(lottieImageAsset != null ? lottieImageAsset.getFileName() : null);
    }

    @Override // com.github.mikephil.chartingv2.formatter.FillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        return ((sw.f) this.f149546b).f161049d.getAxisLeft().getAxisMinimum();
    }

    @Override // com.garmin.android.apps.connectmobile.view.MultiLineImeEditText.b
    public void h() {
        rb1.a aVar = (rb1.a) this.f149546b;
        rb1.g gVar = (rb1.g) aVar.f151582b.getValue();
        MultiLineImeEditText multiLineImeEditText = aVar.f151583c;
        if (multiLineImeEditText != null) {
            gVar.f151624e = String.valueOf(multiLineImeEditText.getText());
        } else {
            p005kotlin.jvm.internal.s.m("mNotesView");
            throw null;
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        int i17 = this.f149545a;
        Object obj = this.f149546b;
        switch (i17) {
            case 4:
                com.garmin.android.apps.connectmobile.activities.manual.a aVar = ((n3) obj).f113923b;
                com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a = aVar.f29169p;
                if (interfaceC0448a != null) {
                    ActivityDiveEditGasesActivity activityDiveEditGasesActivity = (ActivityDiveEditGasesActivity) interfaceC0448a;
                    com.garmin.android.apps.connectmobile.activities.newmodel.r rVar = activityDiveEditGasesActivity.f29130d.get(aVar.f29167n.f29646e);
                    rVar.f29643b = i15;
                    rVar.f29644c = i14;
                    aVar.a(rVar);
                    activityDiveEditGasesActivity.da();
                }
                break;
            case 5:
                int iD = fb1.c.d(i15, 60, i14 * DateTimeConstants.SECONDS_PER_HOUR, i16);
                e23.l<? super Integer, Unit> lVar = ((f1) obj).V0;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(iD));
                }
                break;
            default:
                h2 h2Var = (h2) obj;
                ps.z1 z1Var = new ps.z1(h2Var.T0.getFactor(), h2Var.T0.getUnitId(), (i16 == 0 ? qs.y.UNIT_VOLUME_LITER : qs.y.UNIT_VOLUME_CUBIC_FOOT).f147239a);
                h2Var.T0 = z1Var;
                n3 n3Var = h2Var.S0;
                if (n3Var != null) {
                    double d14 = ((((double) i15) * 1.0d) / 100.0d) + ((double) i14);
                    com.garmin.android.apps.connectmobile.activities.manual.a aVar2 = n3Var.f113923b;
                    com.garmin.android.apps.connectmobile.activities.manual.a.InterfaceC0448a interfaceC0448a2 = aVar2.f29169p;
                    if (interfaceC0448a2 != null) {
                        com.garmin.android.apps.connectmobile.activities.newmodel.r rVar2 = ((ActivityDiveEditGasesActivity) interfaceC0448a2).f29130d.get(aVar2.f29167n.f29646e);
                        rVar2.f29653l = d14;
                        rVar2.f29654m = z1Var;
                        aVar2.a(rVar2);
                    }
                }
                break;
        }
    }

    @Override // androidx.core.view.z
    public androidx.core.view.m1 onApplyWindowInsets(View view2, androidx.core.view.m1 m1Var) {
        ConnectIQAppIntroActivity connectIQAppIntroActivity = (ConnectIQAppIntroActivity) this.f149546b;
        ConnectIQAppIntroActivity.a aVar = ConnectIQAppIntroActivity.f52558r;
        view2.getClass();
        c7.e eVarI = m1Var.f6508a.i(519);
        eVarI.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            j20.x.l("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = connectIQAppIntroActivity.getResources().getDimensionPixelSize(R.dimen.rts_standard_partial_margin) + eVarI.f25191b;
        view2.setLayoutParams(marginLayoutParams);
        return androidx.core.view.m1.f6507b;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.k
    public void onMapLoaded() {
        switch (this.f149545a) {
            case 10:
                ((c.e) this.f149546b).invoke();
                break;
            default:
                v22.e.j(((rs.h) this.f149546b).f154319c);
                break;
        }
    }

    @Override // linc.com.amplituda.callback.AmplitudaSuccessListener
    public void onSuccess(AmplitudaResult amplitudaResult) {
        AudioRecordingView audioRecordingView = (AudioRecordingView) this.f149546b;
        int i14 = AudioRecordingView.C;
        amplitudaResult.getClass();
        List<Integer> listAmplitudesAsList = amplitudaResult.amplitudesAsList();
        listAmplitudesAsList.getClass();
        WaveformView waveformView = audioRecordingView.f47574n;
        List listS0 = p13.h0.S0(listAmplitudesAsList, waveformView.getF47605o());
        long audioDuration = amplitudaResult.getAudioDuration(AmplitudaResult.DurationUnit.MILLIS);
        waveformView.getClass();
        listS0.getClass();
        waveformView.d();
        Iterator it = listS0.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            i15++;
            int iIntValue = ((Number) it.next()).intValue();
            long j8 = i15 * 150;
            if (j8 > audioDuration) {
                break;
            }
            float f14 = iIntValue;
            waveformView.f47595e.put(Long.valueOf(j8), Float.valueOf(f14));
            waveformView.a(waveformView.f47592b, f14, waveformView.f47593c, waveformView.f47594d);
        }
        waveformView.invalidate();
        audioRecordingView.f47572l.setText(String.format("0:%02d", Arrays.copyOf(new Object[]{Long.valueOf(amplitudaResult.getAudioDuration(AmplitudaResult.DurationUnit.SECONDS))}, 1)));
        audioRecordingView.A = false;
        waveformView.setWaveformColor(Color.rgb(166, 166, 166));
    }

    @Override // l7.h
    public boolean perform(View view2, l7.h.a aVar) {
        TextView textView = (TextView) this.f149546b;
        q0.b bVar = q0.f149800b;
        view2.getClass();
        textView.callOnClick();
        return true;
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider lineDataProvider) {
        km.c cVar = (km.c) this.f149546b;
        int i14 = tm.a.E;
        return cVar.f105292n;
    }
}

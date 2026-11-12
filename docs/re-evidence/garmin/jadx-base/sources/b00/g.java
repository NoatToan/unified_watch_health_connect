package b00;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import c22.l3;
import c22.q3;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.handalignment.HandsCalibrationActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.instantinput.InstantInputActivity;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.android.consent.ui.view.DeviceUploadConsentView;
import com.garmin.android.exportablereports.views.custom.ZoomableImageView;
import com.garmin.android.golfswing.GolfSwingViewManager;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import f12.l;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o13.t;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import ot.p;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import p13.x;
import qm.c0;
import yt.n;
import yt.r;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14155b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f14154a = i14;
        this.f14155b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:357:0x0832  */
    /* JADX WARN: Code duplicated, block: B:358:0x084a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) throws Throwable {
        sq0.e eVar;
        Throwable th3;
        double d14;
        double d15;
        double d16;
        double d17;
        sq0.e eVar2;
        ViewParent parent;
        sq0.e eVar3;
        LottieDrawable lottieDrawable;
        LottieDrawable lottieDrawable2;
        Integer numD;
        LottieDrawable lottieDrawable3;
        LottieDrawable lottieDrawable4;
        int i14 = this.f14154a;
        int i15 = 0;
        Object obj = this.f14155b;
        switch (i14) {
            case 0:
                h hVar = (h) obj;
                h.a aVar = hVar.f14158d;
                BarLineChartBase<?> barLineChartBase = hVar.f14156b;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1) {
                    aVar.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 2) {
                    barLineChartBase.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase.setDragEnabled(false);
                    barLineChartBase.setScaleXEnabled(false);
                    pz.d.h(barLineChartBase, motionEvent);
                    aVar.onChartGestureStart(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 3) {
                    aVar.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 5) {
                    barLineChartBase.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase.setDragEnabled(false);
                    barLineChartBase.setScaleXEnabled(false);
                    pz.d.h(barLineChartBase, motionEvent);
                    aVar.onChartGestureStart(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked == 6) {
                    aVar.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                }
                return true;
            case 1:
                ci1.b.d dVar = (ci1.b.d) obj;
                int i16 = ci1.b.d.f27676e;
                dVar.getClass();
                if (motionEvent.getActionMasked() != 0 || (eVar = ci1.b.this.f27668h) == null) {
                    return true;
                }
                eVar.H6(dVar);
                return true;
            case 2:
                InstantInputActivity instantInputActivity = (InstantInputActivity) obj;
                AppCompatEditText appCompatEditText = instantInputActivity.f36911e;
                if (appCompatEditText == null) {
                    s.m("mTextEdit");
                    throw null;
                }
                if (appCompatEditText.getCompoundDrawables()[2] != null && motionEvent.getAction() == 1) {
                    float x14 = motionEvent.getX();
                    AppCompatEditText appCompatEditText2 = instantInputActivity.f36911e;
                    if (appCompatEditText2 == null) {
                        s.m("mTextEdit");
                        throw null;
                    }
                    int width = appCompatEditText2.getWidth();
                    AppCompatEditText appCompatEditText3 = instantInputActivity.f36911e;
                    if (appCompatEditText3 == null) {
                        s.m("mTextEdit");
                        throw null;
                    }
                    int paddingRight = width - appCompatEditText3.getPaddingRight();
                    AppCompatEditText appCompatEditText4 = instantInputActivity.f36911e;
                    if (appCompatEditText4 == null) {
                        s.m("mTextEdit");
                        throw null;
                    }
                    if (x14 > paddingRight - appCompatEditText4.getCompoundDrawables()[2].getIntrinsicWidth()) {
                        AppCompatEditText appCompatEditText5 = instantInputActivity.f36911e;
                        if (appCompatEditText5 == null) {
                            s.m("mTextEdit");
                            throw null;
                        }
                        appCompatEditText5.setText("");
                    }
                }
                return false;
            case 3:
                HandsCalibrationActivity handsCalibrationActivity = (HandsCalibrationActivity) obj;
                HandsCalibrationActivity.a aVar2 = HandsCalibrationActivity.f36565z;
                motionEvent.getClass();
                HandsCalibrationActivity.b bVar = new HandsCalibrationActivity.b(Double.valueOf(motionEvent.getX()), Double.valueOf(motionEvent.getY()));
                double dDoubleValue = ((Number) bVar.f36589a).doubleValue();
                double dDoubleValue2 = ((Number) bVar.f36590b).doubleValue();
                t tVar = handsCalibrationActivity.f36588y;
                HandsCalibrationActivity.b bVar2 = new HandsCalibrationActivity.b(Double.valueOf(dDoubleValue - ((double) ((Rect) tVar.getValue()).centerX())), Double.valueOf(-(dDoubleValue2 - ((double) ((Rect) tVar.getValue()).centerY()))));
                double dDoubleValue3 = ((Number) bVar2.f36589a).doubleValue();
                double dDoubleValue4 = ((Number) bVar2.f36590b).doubleValue();
                double dSqrt = Math.sqrt((dDoubleValue4 * dDoubleValue4) + (dDoubleValue3 * dDoubleValue3));
                double dAtan2 = (dSqrt < (((double) (((float) ((Rect) tVar.getValue()).width()) * 0.8888889f)) * 0.5d) * ((double) 0.4528125f) || dSqrt > ((double) (((float) ((Rect) tVar.getValue()).width()) * 0.8888889f)) * 0.5d) ? Double.NaN : Math.atan2(dDoubleValue4, dDoubleValue3);
                if (Double.valueOf(dAtan2).equals(Double.valueOf(Double.NaN))) {
                    handsCalibrationActivity.f36566a = null;
                } else {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        handsCalibrationActivity.f36566a = Double.valueOf(dAtan2);
                    } else if (action == 1) {
                        handsCalibrationActivity.f36566a = null;
                    } else {
                        if (action != 2) {
                            return false;
                        }
                        Double d18 = handsCalibrationActivity.f36566a;
                        if (d18 != null) {
                            double dDoubleValue5 = d18.doubleValue();
                            if (dDoubleValue5 < 0.0d || dAtan2 >= 0.0d) {
                                th3 = null;
                                d14 = dAtan2;
                                d15 = 0.0d;
                            } else {
                                d15 = 0.0d;
                                th3 = null;
                                d14 = dAtan2;
                                if (Math.abs(dDoubleValue5 * dAtan2) >= Math.pow(3.141592653589793d, 2) / ((double) 4.0f)) {
                                    d17 = 6.283185307179586d;
                                }
                                d16 = (d14 - dDoubleValue5) + d17;
                            }
                            d17 = (dDoubleValue5 >= d15 || d14 < d15 || Math.abs(dDoubleValue5 * d14) < Math.pow(3.141592653589793d, (double) 2) / ((double) 4.0f)) ? d15 : -6.283185307179586d;
                            d16 = (d14 - dDoubleValue5) + d17;
                        } else {
                            th3 = null;
                            d14 = dAtan2;
                            d15 = 0.0d;
                            d16 = 0.0d;
                        }
                        double d19 = -d16;
                        handsCalibrationActivity.f36567b += d19;
                        ImageView imageView = handsCalibrationActivity.f36576k;
                        if (imageView == null) {
                            s.m("wheel");
                            throw th3;
                        }
                        imageView.setRotation(imageView.getRotation() + (-((float) en0.b.a(d16).f64692d)));
                        int iRint = (int) (Math.rint(en0.b.a(Math.abs(handsCalibrationActivity.f36567b)).f64692d / 4.0d) * Math.signum(handsCalibrationActivity.f36567b));
                        Logger logger = HandsCalibrationActivity.A;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("step: " + iRint + ", ");
                        x0 x0Var = x0.f105818a;
                        sb3.append("rad: " + String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(en0.b.a(d14).f64692d)}, 1)) + ", ");
                        Double d24 = handsCalibrationActivity.f36566a;
                        sb3.append("lastRad: " + String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d24 != null ? en0.b.a(d24.doubleValue()).f64692d : d15)}, 1)) + ", ");
                        sb3.append("dTheta: " + String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(en0.b.a(d19).f64692d)}, 1)) + ", ");
                        sb3.append("accumulator: " + String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(en0.b.a(handsCalibrationActivity.f36567b).f64692d)}, 1)) + ", ");
                        logger.trace(sb3.toString());
                        handsCalibrationActivity.f36568c = handsCalibrationActivity.f36568c + iRint;
                        handsCalibrationActivity.ea();
                        handsCalibrationActivity.f36567b -= new en0.c(((double) iRint) * 4.0d, en0.a.C1375a.f64683a).f64691c;
                        handsCalibrationActivity.f36566a = Double.valueOf(d14);
                    }
                }
                return true;
            case 4:
                Logger logger2 = hr2.b.f85292j;
                return ((hr2.b) obj).da().f85301d.d() != hr2.c.a.WEBVIEW_AVAILABLE;
            case 5:
                q62.b bVar3 = (q62.b) obj;
                int i17 = q62.b.f143174r;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 0 && (eVar2 = bVar3.f143190p) != null) {
                    eVar2.H6(bVar3);
                }
                return false;
            case 6:
                c0 c0Var = (c0) obj;
                int i18 = c0.f145331z;
                int action2 = motionEvent.getAction();
                if (action2 == 2 || action2 == 5) {
                    boolean z14 = c0Var.f145339v;
                    List<ps.x0> list = c0Var.f145335p;
                    if (z14) {
                        LineChart lineChart = c0Var.f134442b;
                        if (lineChart != null) {
                            lineChart.setDrawMarkerViews(true);
                        }
                        LineChart lineChart2 = c0Var.f134442b;
                        if (lineChart2 != null) {
                            lineChart2.setDragEnabled(false);
                        }
                        LineChart lineChart3 = c0Var.f134442b;
                        if (lineChart3 != null) {
                            lineChart3.setHighlightPerDragEnabled(true);
                        }
                        LineChart lineChart4 = c0Var.f134442b;
                        if (lineChart4 != null) {
                            lineChart4.setScaleEnabled(false);
                        }
                        LineChart lineChart5 = c0Var.f134442b;
                        Highlight highlightByTouchPoint = lineChart5 != null ? lineChart5.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()) : null;
                        if (highlightByTouchPoint != null) {
                            int xIndex = highlightByTouchPoint.getXIndex();
                            int i19 = xIndex / 2;
                            int size = list.size();
                            LineChart lineChart6 = c0Var.f134442b;
                            if (i19 < size) {
                                if (lineChart6 != null) {
                                    lineChart6.highlightValues(new Highlight[]{new Highlight(xIndex, 0)});
                                }
                                qm.s sVar = c0Var.f145337r;
                                if (sVar == null) {
                                    s.m("markerView");
                                    throw null;
                                }
                                ps.x0 x0Var2 = list.get(i19);
                                x0Var2.getClass();
                                Double duration = x0Var2.getDuration();
                                Double maxSpeed = x0Var2.getMaxSpeed();
                                Double averageSpeed = x0Var2.getAverageSpeed();
                                if (duration != null && maxSpeed != null && averageSpeed != null) {
                                    double dDoubleValue6 = averageSpeed.doubleValue();
                                    double dDoubleValue7 = maxSpeed.doubleValue();
                                    double dDoubleValue8 = duration.doubleValue();
                                    int lapIndex = x0Var2.getLapIndex();
                                    TextView textView = sVar.f145447i;
                                    Context context = sVar.ctx;
                                    textView.setText(context.getString(R.string.lbl_racing_lap_number, String.valueOf(lapIndex)));
                                    q3 q3Var = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y() ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                    long j8 = (long) (dDoubleValue8 * ((double) 1000));
                                    l3.f23124b.getClass();
                                    int i24 = (int) (j8 / ((long) DateTimeConstants.MILLIS_PER_MINUTE));
                                    int i25 = ((int) (j8 - ((long) (DateTimeConstants.MILLIS_PER_MINUTE * i24)))) / 1000;
                                    int i26 = (int) (j8 % ((long) 1000));
                                    x0 x0Var3 = x0.f105818a;
                                    sVar.f145448j.setText(context.getString(R.string.lbl_racing_lap_time_description, String.format(Locale.getDefault(), "%01d:%02d.%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i24), Integer.valueOf(i25), Integer.valueOf(i26)}, 3))));
                                    q6.f.y(new Object[]{sVar.f145446h, l3.a.M0(sVar.getContext(), dDoubleValue7, q3Var, l3.f23130h, true)}, 2, "%s: %s", sVar.f145449k);
                                    sVar.f145450l.setText(context.getString(R.string.lbl_racing_avg_lap_speed, l3.a.N0(sVar.getContext(), dDoubleValue6, q3Var, l3.f23130h, true, null)));
                                }
                            } else if (lineChart6 != null) {
                                lineChart6.highlightValues(null);
                            }
                        }
                        LineChart lineChart7 = c0Var.f134442b;
                        if (lineChart7 != null && (parent = lineChart7.getParent()) != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (action2 == 1 || action2 == 6) {
                    c0Var.f145339v = false;
                    LineChart lineChart8 = c0Var.f134442b;
                    if (lineChart8 != null) {
                        lineChart8.setDrawMarkerViews(false);
                    }
                    c0Var.x();
                }
                return false;
            case 7:
                AudioRecordingView audioRecordingView = (AudioRecordingView) obj;
                int i27 = AudioRecordingView.C;
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    com.garmin.android.apps.connectmobile.view.audiorecording.b bVar4 = audioRecordingView.f47562b;
                    Context context2 = audioRecordingView.getContext();
                    context2.getClass();
                    bVar4.getClass();
                    if (a7.b.checkSelfPermission(context2, "android.permission.RECORD_AUDIO") == 0 && !audioRecordingView.f47583y && audioRecordingView.f47584z) {
                        audioRecordingView.f47584z = false;
                        audioRecordingView.f();
                        return true;
                    }
                }
                return false;
            case 8:
                com.garmin.android.apps.connectmobile.navigation.a.e eVar4 = (com.garmin.android.apps.connectmobile.navigation.a.e) obj;
                int i28 = com.garmin.android.apps.connectmobile.navigation.a.e.f39349g;
                eVar4.getClass();
                if (motionEvent.getActionMasked() == 0 && (eVar3 = eVar4.f39355f.f39338e) != null) {
                    eVar3.H6(eVar4);
                }
                return false;
            case 9:
                return ((DeviceUploadConsentView) obj).f49839e.getVisibility() == 0;
            case 10:
                GolfSwingViewManager.getInstance().pausePlay();
                ((com.garmin.android.apps.connectmobile.golf.truswing.f) obj).f35834f.setPlayButtonState(false);
                return GolfSwingViewManager.getInstance().onTouchEvent(motionEvent);
            case 11:
                return MobileAuthAbstractWebFrag.onViewCreated$lambda$7$lambda$6((MobileAuthAbstractWebFrag) obj, view2, motionEvent);
            case 12:
                yt.h hVar2 = (yt.h) obj;
                int i29 = yt.h.f199301x;
                r rVarY4 = hVar2.w6().y4();
                r rVar = r.CHAPTER;
                if (rVarY4 == rVar || rVarY4 == r.SHARE) {
                    ut.a aVar3 = hVar2.f199303b;
                    if (aVar3 == null) {
                        s.m("binding");
                        throw null;
                    }
                    float width2 = aVar3.f172541a.getWidth() / 2.0f;
                    ut.a aVar4 = hVar2.f199303b;
                    if (aVar4 == null) {
                        s.m("binding");
                        throw null;
                    }
                    int measuredHeight = aVar4.f172547g.getMeasuredHeight();
                    ut.a aVar5 = hVar2.f199303b;
                    if (aVar5 == null) {
                        s.m("binding");
                        throw null;
                    }
                    int measuredHeight2 = aVar5.f172544d.getMeasuredHeight() + measuredHeight;
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        LottieDrawable lottieDrawable5 = hVar2.f199306e;
                        if (lottieDrawable5 != null && lottieDrawable5.isAnimating() && (lottieDrawable = hVar2.f199306e) != null) {
                            lottieDrawable.pauseAnimation();
                        }
                        hVar2.f199311j = false;
                        Handler handler = hVar2.f199312k;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        hVar2.f199312k = handler2;
                        handler2.postDelayed(new yt.e(hVar2, i15), 500L);
                        return true;
                    }
                    if (action3 == 1) {
                        if (hVar2.f199311j) {
                            LottieDrawable lottieDrawable6 = hVar2.f199306e;
                            if (lottieDrawable6 == null || lottieDrawable6.isAnimating() || hVar2.w6().y4() != rVar || (lottieDrawable2 = hVar2.f199306e) == null) {
                                return true;
                            }
                            lottieDrawable2.resumeAnimation();
                            return true;
                        }
                        Handler handler3 = hVar2.f199312k;
                        if (handler3 != null) {
                            handler3.removeCallbacksAndMessages(null);
                        }
                        float x15 = motionEvent.getX();
                        if (motionEvent.getY() < measuredHeight2) {
                            LottieDrawable lottieDrawable7 = hVar2.f199306e;
                            if (lottieDrawable7 == null || lottieDrawable7.isAnimating() || hVar2.w6().y4() != rVar || (lottieDrawable4 = hVar2.f199306e) == null) {
                                return true;
                            }
                            lottieDrawable4.resumeAnimation();
                            return true;
                        }
                        if (x15 >= width2) {
                            if (x15 <= width2 || hVar2.w6().y4() == r.SHARE) {
                                return true;
                            }
                            p pVarX4 = hVar2.w6().x4();
                            if (pVarX4 != null) {
                                String strConcat = "handleSkipChapter ".concat(pVarX4.getClass().getSimpleName());
                                i2.a aVar6 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar6.getClass();
                                i2.a.b(a2Var, "AnnualReportPlayerFragment", strConcat);
                                nt.a aVar7 = nt.a.f127827a;
                                String strF = pVarX4.f();
                                aVar7.getClass();
                                strF.getClass();
                                ht.s sVar2 = ht.s.f85508a;
                                lt.a.f fVar = new lt.a.f(strF, lt.a.c.ACTION_CHAPTER_SKIP);
                                sVar2.getClass();
                                ht.s.a(fVar);
                            }
                            n nVarW6 = hVar2.w6();
                            if (nVarW6.f199345f.d() != rVar) {
                                return true;
                            }
                            nVarW6.A4();
                            return true;
                        }
                        n nVarW7 = hVar2.w6();
                        r rVarD = nVarW7.f199345f.d();
                        int i30 = rVarD == null ? -1 : n.b.f199356b[rVarD.ordinal()];
                        if (i30 == 1) {
                            Integer numD2 = nVarW7.f199343d.d();
                            int iIntValue = numD2 != null ? numD2.intValue() : -1;
                            if (iIntValue > 0) {
                                nVarW7.z4(iIntValue - 1);
                                i2.a aVar8 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar8.getClass();
                                i2.a.b(a2Var2, "AnnualReportPlayerViewModel", "playPreviousAnimation ");
                            }
                        } else if (i30 == 2) {
                            i2.a aVar9 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar9.getClass();
                            i2.a.b(a2Var3, "AnnualReportPlayerViewModel", "Replay Recap Chapter");
                            nVarW7.z4(x.j(nVarW7.f199344e));
                        }
                        LottieDrawable lottieDrawable8 = hVar2.f199306e;
                        if (lottieDrawable8 == null || lottieDrawable8.isAnimating() || (numD = hVar2.w6().f199343d.d()) == null || numD.intValue() != 0 || (lottieDrawable3 = hVar2.f199306e) == null) {
                            return true;
                        }
                        lottieDrawable3.resumeAnimation();
                        return true;
                    }
                }
                return false;
            case 13:
                za1.h hVar3 = (za1.h) obj;
                za1.h.a aVar10 = hVar3.f203320c;
                BarLineChartBase<?> barLineChartBase2 = hVar3.f203319b;
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 1) {
                    aVar10.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked2 == 2) {
                    barLineChartBase2.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase2.setDragEnabled(false);
                    barLineChartBase2.setScaleXEnabled(false);
                    pz.d.h(barLineChartBase2, motionEvent);
                    ChartTouchListener.ChartGesture chartGesture = ChartTouchListener.ChartGesture.NONE;
                    aVar10.getClass();
                } else if (actionMasked2 == 3) {
                    aVar10.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                } else if (actionMasked2 == 5) {
                    barLineChartBase2.getParent().requestDisallowInterceptTouchEvent(true);
                    barLineChartBase2.setDragEnabled(false);
                    barLineChartBase2.setScaleXEnabled(false);
                    pz.d.h(barLineChartBase2, motionEvent);
                    ChartTouchListener.ChartGesture chartGesture2 = ChartTouchListener.ChartGesture.NONE;
                    aVar10.getClass();
                } else if (actionMasked2 == 6) {
                    aVar10.onChartGestureEnd(motionEvent, ChartTouchListener.ChartGesture.NONE);
                }
                return true;
            default:
                ZoomableImageView zoomableImageView = (ZoomableImageView) obj;
                ScaleGestureDetector scaleGestureDetector = zoomableImageView.f49863f;
                PointF pointF = zoomableImageView.f49861d;
                PointF pointF2 = zoomableImageView.f49860c;
                scaleGestureDetector.onTouchEvent(motionEvent);
                Matrix matrix = zoomableImageView.f49858a;
                float[] fArr = zoomableImageView.f49862e;
                matrix.getValues(fArr);
                float f14 = fArr[2];
                float f15 = fArr[5];
                PointF pointF3 = new PointF(motionEvent.getX(), motionEvent.getY());
                int action4 = motionEvent.getAction();
                if (action4 == 0) {
                    pointF2.set(motionEvent.getX(), motionEvent.getY());
                    pointF.set(pointF2);
                    zoomableImageView.f49859b = 1;
                } else if (action4 == 1) {
                    zoomableImageView.f49859b = 0;
                    int iAbs = (int) Math.abs(pointF3.x - pointF.x);
                    int iAbs2 = (int) Math.abs(pointF3.y - pointF.y);
                    if (iAbs < 3 && iAbs2 < 3) {
                        zoomableImageView.performClick();
                    }
                } else if (action4 == 2) {
                    int i34 = zoomableImageView.f49859b;
                    if (i34 == 2 || (i34 == 1 && zoomableImageView.f49870m > zoomableImageView.f49864g)) {
                        float f16 = pointF3.x - pointF2.x;
                        float f17 = pointF3.y - pointF2.y;
                        float fD = MathKt.d(zoomableImageView.f49873p * zoomableImageView.f49870m);
                        float fD2 = MathKt.d(zoomableImageView.f49874q * zoomableImageView.f49870m);
                        if (fD < zoomableImageView.f49868k) {
                            float f18 = f15 + f17;
                            if (f18 > 0.0f) {
                                f17 = -f15;
                            } else {
                                float f19 = zoomableImageView.f49872o;
                                if (f18 < (-f19)) {
                                    f15 += f19;
                                    f17 = -f15;
                                }
                            }
                            f16 = 0.0f;
                        } else if (fD2 < zoomableImageView.f49869l) {
                            float f22 = f14 + f16;
                            if (f22 > 0.0f) {
                                f16 = -f14;
                            } else {
                                float f24 = zoomableImageView.f49871n;
                                if (f22 < (-f24)) {
                                    f14 += f24;
                                    f16 = -f14;
                                }
                            }
                            f17 = 0.0f;
                        } else {
                            float f25 = f14 + f16;
                            if (f25 > 0.0f) {
                                f16 = -f14;
                            } else {
                                float f26 = zoomableImageView.f49871n;
                                if (f25 < (-f26)) {
                                    f14 += f26;
                                    f16 = -f14;
                                }
                            }
                            float f27 = f15 + f17;
                            if (f27 > 0.0f) {
                                f17 = -f15;
                            } else {
                                float f28 = zoomableImageView.f49872o;
                                if (f27 < (-f28)) {
                                    f15 += f28;
                                    f17 = -f15;
                                }
                            }
                        }
                        matrix.postTranslate(f16, f17);
                        pointF2.set(pointF3.x, pointF3.y);
                    }
                } else if (action4 == 5) {
                    pointF2.set(motionEvent.getX(), motionEvent.getY());
                    pointF.set(pointF2);
                    zoomableImageView.f49859b = 2;
                } else if (action4 == 6) {
                    zoomableImageView.f49859b = 0;
                }
                zoomableImageView.setImageMatrix(matrix);
                zoomableImageView.invalidate();
                return true;
        }
    }
}

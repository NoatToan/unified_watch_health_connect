package iw0;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import b63.o;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001:\u0001\u0011B-\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Liw0/d;", "Lqz/c;", "Lkw0/f;", "Lkw0/e$a;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Lcom/github/mikephil/charting/data/Entry;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpi0/e;", "dateTimeFormatter", "Lj23/g;", "Lb63/o;", "dateInterval", "", "daily", "<init>", "(Landroid/content/Context;Lpi0/e;Lj23/g;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.c<kw0.f<kw0.e.a>, IBarLineScatterCandleBubbleDataSet<Entry>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f95291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j23.g<o> f95292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f95298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f95299j;

    static {
        new a(null);
    }

    public d(Context context, pi0.e eVar, j23.g<o> gVar, boolean z14) {
        context.getClass();
        eVar.getClass();
        gVar.getClass();
        this.f95290a = context;
        this.f95291b = eVar;
        this.f95292c = gVar;
        this.f95293d = z14;
        this.f95294e = c7.d.e(context.getColor(R.color.gcm_chart_hrv_baseline), 178);
        this.f95295f = context.getColor(R.color.gcm_chart_highlight_line);
        String string = context.getString(R.string.lbl_7d_avg);
        string.getClass();
        this.f95296g = string;
        String string2 = context.getString(R.string.lbl_ms);
        string2.getClass();
        this.f95297h = string2;
        this.f95298i = context.getResources().getDimensionPixelSize(R.dimen.chart_value_item_size);
        this.f95299j = true;
    }

    public static Entry y(d dVar, float f14, float f15, l lVar, int i14) {
        if ((i14 & 4) != 0) {
            lVar = null;
        }
        return lVar != null ? new Entry(f14, f15, lVar) : new Entry(f14, f15);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<Entry>> a(kw0.f<kw0.e.a> fVar) {
        List<kw0.e.a> list;
        List<kw0.a> list2;
        int i14;
        List<kw0.e.a> list3;
        l lVar;
        Integer numE;
        BitmapDrawable bitmapDrawableC;
        Object next;
        i41.a aVar;
        kw0.f<kw0.e.a> fVar2 = fVar;
        this.f95299j = fVar2 != null ? fVar2.f106946c : true;
        List<kw0.a> list4 = fVar2 != null ? fVar2.f106949f : null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (fVar2 != null && (list = fVar2.f106947d) != null) {
            int size = list.size();
            int i15 = 0;
            while (i15 < size) {
                kw0.e.a aVar2 = list.get(i15);
                o oVar = aVar2.f106922f;
                pi0.e eVar = this.f95291b;
                j23.g<o> gVar = this.f95292c;
                boolean z14 = this.f95293d;
                Context context = this.f95290a;
                if (oVar != null) {
                    i41.a aVar3 = aVar2.f106932p;
                    String str = aVar2.f106931o;
                    DateTime dateTimeAtStartOfDay = g22.l.h(oVar).toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    String strI = lw0.b.i(z14, dateTimeAtStartOfDay, eVar);
                    int iJ = lw0.b.j((o) gVar.getStart(), oVar, z14);
                    if (aVar3 == null || !t31.b.c(aVar3, str)) {
                        list2 = list4;
                        i14 = size;
                    } else {
                        Integer balancedLow = aVar3.getBalancedLow();
                        if (balancedLow != null) {
                            int iIntValue = balancedLow.intValue();
                            list2 = list4;
                            aVar = aVar3;
                            i14 = size;
                            String str2 = aVar3.getBalancedLow() + "-" + aVar.getBalancedUpper();
                            if (s.g(str, x31.b.POOR.toString())) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(y(this, iJ, iIntValue, new l(strI, str2, context.getString(R.string.ohrv_baseline), context.getString(R.string.lbl_ms), null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet_hrv), null, SyslogConstants.LOG_LOCAL6, null), 8));
                            }
                        } else {
                            list2 = list4;
                            aVar = aVar3;
                            i14 = size;
                        }
                        Integer balancedUpper = aVar.getBalancedUpper();
                        if (balancedUpper != null) {
                            int iIntValue2 = balancedUpper.intValue();
                            if (s.g(str, x31.b.POOR.toString())) {
                                arrayList3.add(null);
                            } else {
                                arrayList3.add(y(this, iJ, iIntValue2, null, 12));
                            }
                        }
                    }
                } else {
                    list2 = list4;
                    i14 = size;
                }
                kw0.e.a aVar4 = list.get(i15);
                o oVar2 = aVar4.f106922f;
                if (oVar2 != null) {
                    int iJ2 = lw0.b.j((o) gVar.getStart(), oVar2, z14);
                    Integer num = aVar4.f106923g;
                    DateTime dateTimeAtStartOfDay2 = g22.l.h(oVar2).toDateTimeAtStartOfDay();
                    if (num != null) {
                        if (list2 != null) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    list3 = list;
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                list3 = list;
                                if (s.g(((kw0.a) next).f106903a, oVar2)) {
                                    break;
                                }
                                list = list3;
                            }
                            kw0.a aVar5 = (kw0.a) next;
                            pv0.s sVar = aVar5 != null ? aVar5.f106904b : null;
                            dateTimeAtStartOfDay2.getClass();
                            ArrayList arrayListF = lw0.b.f(dateTimeAtStartOfDay2, eVar, context, aVar4, this.f95296g, this.f95297h, sVar, this.f95299j, this.f95293d);
                            Entry entry = new Entry(iJ2, num.intValue(), h0.G0(arrayListF));
                            lVar = (l) h0.d0(arrayListF);
                            numE = lw0.b.e(z14, lVar);
                            if (numE != null) {
                                bitmapDrawableC = r0.c(r0.f23226a, context, numE.intValue(), this.f95298i);
                                if (bitmapDrawableC != null) {
                                    bitmapDrawableC = null;
                                } else if (lVar != null) {
                                    lw0.b.a(bitmapDrawableC, context, z14, lVar);
                                }
                            } else {
                                bitmapDrawableC = null;
                            }
                            entry.setIcon(bitmapDrawableC);
                            arrayList.add(entry);
                        } else {
                            list3 = list;
                        }
                        dateTimeAtStartOfDay2.getClass();
                        ArrayList arrayListF2 = lw0.b.f(dateTimeAtStartOfDay2, eVar, context, aVar4, this.f95296g, this.f95297h, sVar, this.f95299j, this.f95293d);
                        Entry entry2 = new Entry(iJ2, num.intValue(), h0.G0(arrayListF2));
                        lVar = (l) h0.d0(arrayListF2);
                        numE = lw0.b.e(z14, lVar);
                        if (numE != null) {
                            bitmapDrawableC = r0.c(r0.f23226a, context, numE.intValue(), this.f95298i);
                            if (bitmapDrawableC != null) {
                                bitmapDrawableC = null;
                            } else if (lVar != null) {
                                lw0.b.a(bitmapDrawableC, context, z14, lVar);
                            }
                        } else {
                            bitmapDrawableC = null;
                        }
                        entry2.setIcon(bitmapDrawableC);
                        arrayList.add(entry2);
                    } else {
                        list3 = list;
                        if (z14) {
                            arrayList.add(null);
                        }
                    }
                } else {
                    list3 = list;
                }
                i15++;
                list = list3;
                list4 = list2;
                size = i14;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (arrayList.contains(null)) {
            int i16 = 0;
            int i17 = 0;
            while (i16 < arrayList.size()) {
                if (arrayList.get(i16) == null) {
                    arrayList4.add(z(arrayList.subList(i17, i16)));
                    i17 = i16 + 1;
                    i16 = i17;
                } else {
                    i16++;
                }
            }
            List<? extends Entry> listSubList = arrayList.subList(i17, i16);
            if (!listSubList.isEmpty()) {
                arrayList4.add(z(listSubList));
            }
        } else {
            arrayList4.add(z(arrayList));
        }
        if (arrayList2.contains(null)) {
            int i18 = 0;
            int i19 = 0;
            while (i18 < arrayList2.size()) {
                if (arrayList2.get(i18) == null) {
                    List<LineDataSet> listX = x(arrayList2.subList(i19, i18), arrayList3.subList(i19, i18));
                    arrayList4.add(listX.get(0));
                    arrayList4.add(listX.get(1));
                    i19 = i18 + 1;
                    i18 = i19;
                } else {
                    i18++;
                }
            }
            if (!arrayList2.subList(i19, i18).isEmpty()) {
                List<LineDataSet> listX2 = x(arrayList2.subList(i19, i18), arrayList3.subList(i19, i18));
                arrayList4.add(listX2.get(0));
                arrayList4.add(listX2.get(1));
            }
        } else {
            List<LineDataSet> listX3 = x(arrayList2, arrayList3);
            arrayList4.add(listX3.get(0));
            arrayList4.add(listX3.get(1));
        }
        arrayList5.addAll(arrayList4);
        return arrayList5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(kw0.f<kw0.e.a> fVar) {
        return Integer.valueOf(lw0.b.b(this.f95292c, this.f95293d));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(kw0.f<kw0.e.a> fVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(kw0.f<kw0.e.a> fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final float i(kw0.f<kw0.e.a> fVar) {
        List<kw0.e.a> list;
        kw0.e.a aVar;
        Float f14;
        kw0.f<kw0.e.a> fVar2 = fVar;
        if (fVar2 == null || (list = fVar2.f106947d) == null || (aVar = (kw0.e.a) h0.e0(0, list)) == null || (f14 = aVar.f106927k) == null) {
            return 110.0f;
        }
        return f14.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(kw0.f<kw0.e.a> fVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final float q(kw0.f<kw0.e.a> fVar) {
        return lw0.b.c(this.f95292c, this.f95293d, false);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final float t(kw0.f<kw0.e.a> fVar) {
        List<kw0.e.a> list;
        kw0.e.a aVar;
        Float f14;
        kw0.f<kw0.e.a> fVar2 = fVar;
        if (fVar2 == null || (list = fVar2.f106947d) == null || (aVar = (kw0.e.a) h0.e0(0, list)) == null || (f14 = aVar.f106928l) == null) {
            return 0.0f;
        }
        return f14.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(kw0.f<kw0.e.a> fVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(kw0.f<kw0.e.a> fVar) {
        return 0.0f;
    }

    public final List<LineDataSet> x(List<? extends Entry> list, List<? extends Entry> list2) {
        LineDataSet lineDataSet = new LineDataSet(list, "BASELINE_DATA_SET");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setFillAlpha(178);
        int i14 = this.f95294e;
        lineDataSet.setFillColor(i14);
        lineDataSet.setColor(i14);
        int i15 = this.f95295f;
        lineDataSet.setHighLightColor(i15);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setLineWidth(0.5f);
        LineDataSet lineDataSet2 = new LineDataSet(list2, "");
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setDrawCircleHole(false);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setFillAlpha(178);
        lineDataSet2.setFillColor(i14);
        lineDataSet2.setDrawFilled(true);
        lineDataSet2.setFillFormatter(new yz.a(lineDataSet));
        lineDataSet2.setDrawHorizontalHighlightIndicator(false);
        lineDataSet2.setHighLightColor(i15);
        lineDataSet2.setHighlightLineWidth(2.0f);
        lineDataSet2.setColor(i14);
        lineDataSet2.setLineWidth(0.5f);
        return x.k(lineDataSet, lineDataSet2);
    }

    public final LineDataSet z(List<? extends Entry> list) {
        LineDataSet lineDataSet = new LineDataSet(list, "OVERNIGHT_AVG_DATA_SET");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.enableDashedLine(4.0f, 4.0f, 0.0f);
        lineDataSet.setHighLightColor(this.f95295f);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setColor(this.f95290a.getColor(lw0.b.d(this.f95299j, this.f95293d)));
        lineDataSet.setLineWidth(2.0f);
        return lineDataSet;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liw0/d$a;", "", "<init>", "()V", "", "KEY_BASELINE_DATA_SET", "Ljava/lang/String;", "KEY_OVERNIGHT_AVG_DATA_SET", "", "OVERNIGHT_HRV_CHART_MIN_VALUE", "F", "OVERNIGHT_HRV_CHART_MAX_VALUE", "", "BASELINE_OPACITY", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

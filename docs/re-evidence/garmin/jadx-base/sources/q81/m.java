package q81;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e32.p;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lq81/m;", "Le32/p;", "Lu81/b;", "Landroid/view/View;", "view", "Le32/l;", "Lo81/d;", "navigator", "Lorg/joda/time/LocalDate;", "startDate", "<init>", "(Landroid/view/View;Le32/l;Lorg/joda/time/LocalDate;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m implements p<u81.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e32.l<o81.d> f143346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f143347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f143348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f143349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f143350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f143351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f143352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CustomLineChart f143353h;

    public m(View view2, e32.l<o81.d> lVar, LocalDate localDate) {
        view2.getClass();
        lVar.getClass();
        localDate.getClass();
        this.f143346a = lVar;
        this.f143347b = (ComposeView) view2.findViewById(R.id.gcm_stats_row_1);
        View viewFindViewById = view2.findViewById(R.id.hill_score_report_list);
        viewFindViewById.getClass();
        this.f143348c = (ComposeView) viewFindViewById;
        this.f143349d = (TextView) view2.findViewById(R.id.no_data_message);
        Context context = view2.getContext();
        context.getClass();
        this.f143350e = context;
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f143351f = string;
        String string2 = context.getString(R.string.common_no_data);
        string2.getClass();
        this.f143352g = string2;
        View viewFindViewById2 = view2.findViewById(R.id.chart_view);
        viewFindViewById2.getClass();
        this.f143353h = (CustomLineChart) viewFindViewById2;
    }

    @Override // e32.p
    public final void a() {
        e(null, null);
    }

    @Override // e32.p
    public final /* bridge */ /* synthetic */ boolean b(u81.b bVar) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    @Override // e32.p
    /* JADX INFO: renamed from: d */
    public void c(u81.b bVar) {
        List<u81.a> list;
        ArrayList arrayList;
        t71.a aVar;
        Map<LocalDate, Integer> map;
        t71.a aVar2;
        Map<LocalDate, Integer> map2;
        t71.a aVar3;
        Integer num;
        Collection<Integer> collectionValues;
        TextView textView = this.f143349d;
        if (bVar == null || (num = bVar.f169475e) == null) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            ComposeView composeView = this.f143347b;
            if (composeView != null) {
                composeView.setVisibility(8);
            }
        } else {
            int iIntValue = num.intValue();
            if (textView != null) {
                textView.setVisibility(8);
            }
            Map<LocalDate, Integer> map3 = bVar.f169474d;
            ArrayList arrayListZ = (map3 == null || (collectionValues = map3.values()) == null) ? null : h0.Z(collectionValues);
            e((arrayListZ == null || arrayListZ.isEmpty()) ? this.f143351f : String.valueOf(h0.R0(arrayListZ) / arrayListZ.size()), String.valueOf(iIntValue));
        }
        new a();
        int f143315i = getF143325i();
        Context context = this.f143350e;
        context.getClass();
        if (f143315i != 5) {
            if (f143315i != 6) {
                if (f143315i != 10 || bVar == null || (map2 = bVar.f169474d) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Map.Entry<LocalDate, Integer> entry : map2.entrySet()) {
                        Integer value = entry.getValue();
                        if (value != null) {
                            int iIntValue2 = value.intValue();
                            LocalDate key = entry.getKey();
                            j jVar = j.f143327a;
                            int iIntValue3 = value.intValue();
                            jVar.getClass();
                            String string = context.getString(j.a(iIntValue3));
                            string.getClass();
                            aVar3 = new t71.a(iIntValue2, key, string);
                        } else {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            arrayList.add(aVar3);
                        }
                    }
                }
            } else if (bVar == null || (map = bVar.f169474d) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Map.Entry<LocalDate, Integer> entry2 : map.entrySet()) {
                    Integer value2 = entry2.getValue();
                    if (value2 != null) {
                        int iIntValue4 = value2.intValue();
                        LocalDate key2 = entry2.getKey();
                        j jVar2 = j.f143327a;
                        int iIntValue5 = value2.intValue();
                        jVar2.getClass();
                        String string2 = context.getString(j.a(iIntValue5));
                        string2.getClass();
                        aVar2 = new t71.a(iIntValue4, key2, string2);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                }
            }
        } else if (bVar == null || (list = bVar.f169476f) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (u81.a aVar4 : list) {
                Integer num2 = aVar4.f169466h;
                if (num2 != null) {
                    int iIntValue6 = num2.intValue();
                    LocalDate localDate = new LocalDate(aVar4.f169461c);
                    j jVar3 = j.f143327a;
                    int iIntValue7 = num2.intValue();
                    jVar3.getClass();
                    String string3 = context.getString(j.a(iIntValue7));
                    string3.getClass();
                    aVar = new t71.a(iIntValue6, localDate, string3);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            qz.a.b(f(), arrayList, null, 6);
            return;
        }
        String str = this.f143352g;
        CustomLineChart customLineChart = this.f143353h;
        customLineChart.setNoDataText(str);
        customLineChart.clear();
    }

    public final void e(String str, String str2) {
        if (str == null) {
            str = this.f143351f;
        }
        String str3 = str;
        Context context = this.f143350e;
        String strA = oi0.c.A(context, new po2.o(25), e5.g(str3, StringUtils.SPACE, context.getString(R.string.lbl_hill_score_avg_score)));
        ComposeView composeView = this.f143347b;
        if (composeView != null) {
            composeView.setContent(new z3.e(401581614, true, new l(str3, strA, str2, this, 0)));
        }
    }

    public abstract tz.a<List<t71.a>> f();

    /* JADX INFO: renamed from: g */
    public abstract int getF143325i();
}

package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.internal.LazilyParsedNumber;
import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.SnoreDreamTalkAudio;
import com.xiaomi.fit.fitness.export.utils.SleepAudioFileUtils;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.view.BarChartRecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.valueformatter.SleepSnoreDecibelHighLightMarkValueFormatter;
import com.xiaomi.fitness.health.sleep.ui.SleepAudioUnderstandFragment;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataTitleView;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class pym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f30909b;
    public DataTitleView c;
    public BarChartRecyclerView d;
    public q02 e;
    public List<RecyclerBarEntry> f;
    public r02 g;
    public rtr h;
    public xym i;
    public vqr j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecyclerView f30910k;
    public azm l;
    public List<yym> m = new ArrayList();
    public LinearLayout n;

    public class a implements azm.e {

        /* JADX INFO: renamed from: pym$a$a, reason: collision with other inner class name */
        public class C1083a extends av6 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yym f30912a;

            public C1083a(yym yymVar) {
                this.f30912a = yymVar;
            }

            @Override // defpackage.av6
            public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
                super.onDialogClick(str, dialogInterface, i);
                if (i == -1) {
                    File fileA = this.f30912a.a();
                    boolean z = im9.z(fileA);
                    Logger.i("MiHealth", "SleepSnoreAndDreamTalkHolder onDelete file:" + fileA.getAbsolutePath() + "/delete result:" + z);
                    if (z) {
                        pym.this.m.remove(this.f30912a);
                        pym.this.l.x(pym.this.m);
                    }
                }
            }
        }

        public a() {
        }

        @Override // azm.e
        public void a(yym yymVar) {
            CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("delete").setDialogTitle(c0j.F7).setDialogDescription(c0j.E7).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create().addDialogCallback(new C1083a(yymVar));
            if (pym.this.f30909b instanceof FragmentActivity) {
                commonDialogAddDialogCallback.showIfNeed(((FragmentActivity) pym.this.f30909b).getSupportFragmentManager());
            }
        }

        @Override // azm.e
        public void b(yym yymVar) {
            hym.b(pym.this.f30909b, yymVar.a().getAbsolutePath(), pym.this.f30909b.getString(c0j.mh));
        }

        @Override // azm.e
        public void c(yym yymVar, boolean z) {
            for (yym yymVar2 : pym.this.m) {
                if (yymVar2.equals(yymVar)) {
                    yymVar.i(z);
                } else {
                    yymVar2.i(false);
                }
                pym.this.l.x(pym.this.m);
            }
        }
    }

    public class b extends xcm {
        public b() {
        }

        @Override // defpackage.xcm, defpackage.u8h
        public void onItemSelected(RecyclerBarEntry recyclerBarEntry, int i) {
            if (recyclerBarEntry == null || !recyclerBarEntry.isSelected()) {
                pym.this.c.setVisibility(0);
            } else {
                pym.this.c.setVisibility(8);
            }
        }
    }

    public pym(View view) {
        View viewFindViewById = view.findViewById(eri.ha);
        this.f30908a = viewFindViewById;
        this.f30909b = viewFindViewById.getContext();
        j();
    }

    public static /* synthetic */ int k(Long l, Long l2) {
        return l2.compareTo(l);
    }

    public final void g(List<yym> list, List<SnoreDreamTalkAudio> list2) {
        for (SnoreDreamTalkAudio snoreDreamTalkAudio : list2) {
            File theSleepAudioFile = SleepAudioFileUtils.INSTANCE.getTheSleepAudioFile(snoreDreamTalkAudio);
            if (theSleepAudioFile == null || !FileUtils.isFileExists(theSleepAudioFile.getAbsolutePath())) {
                StringBuilder sb = new StringBuilder();
                sb.append("refreshSnoreAndDreamTalkList fillList file not exit:");
                sb.append(theSleepAudioFile == null ? "file null" : theSleepAudioFile.getAbsolutePath());
                Logger.i("MiHealth", sb.toString());
            } else {
                yym yymVar = new yym();
                yymVar.f(snoreDreamTalkAudio.getType());
                yymVar.g(snoreDreamTalkAudio.getBeginTime());
                yymVar.h(snoreDreamTalkAudio.getDuration());
                yymVar.e(theSleepAudioFile);
                list.add(yymVar);
            }
        }
    }

    public final void h() {
        this.d.addOnItemTouchListener(new hak(this.f30909b, this.d, new b()));
    }

    public final void i() {
        this.f30910k = (RecyclerView) this.f30908a.findViewById(eri.Ig);
        this.l = new azm();
        this.f30910k.setLayoutManager(new LinearLayoutManager(this.f30909b));
        this.f30910k.setAdapter(this.l);
        this.l.w(new a());
    }

    public final void j() {
        ((TextView) this.f30908a.findViewById(eri.Bl)).setText(c0j.qk);
        this.c = (DataTitleView) this.f30908a.findViewById(eri.Hg);
        this.d = (BarChartRecyclerView) this.f30908a.findViewById(eri.Gg);
        this.n = (LinearLayout) this.f30908a.findViewById(eri.Zk);
        this.g = (r02) this.d.mAttrs;
        this.j = new vqr(this.g, 16, BarChartRecyclerHelper.INSTANCE.createXAxisFormatter(this.f30909b, 0));
        rtr rtrVar = new rtr(this.g);
        this.h = rtrVar;
        this.i = new xym(rtrVar, this.j, this.g);
        SleepSnoreDecibelHighLightMarkValueFormatter sleepSnoreDecibelHighLightMarkValueFormatter = new SleepSnoreDecibelHighLightMarkValueFormatter(0);
        this.i.setHighLightValueFormatter(sleepSnoreDecibelHighLightMarkValueFormatter);
        this.d.addItemDecoration(this.i);
        this.d.setLayoutManager(new SpeedRatioLayoutManager(this.f30909b, this.g));
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        q02 q02Var = new q02(this.f30909b, arrayList, this.d, this.j, this.g, sleepSnoreDecibelHighLightMarkValueFormatter);
        this.e = q02Var;
        this.d.setAdapter(q02Var);
        this.d.setNestedScrollingEnabled(false);
        h();
        i();
    }

    public final /* synthetic */ void l(View view) {
        dih.a().e(this.f30909b, new FragmentParams.b().e(SleepAudioUnderstandFragment.class).a(true).b());
    }

    public final void m(SleepSegmentReport sleepSegmentReport) {
        String string;
        String strA;
        Integer snoreDuration = sleepSegmentReport.getSnoreDuration();
        Integer dreamTalkCount = sleepSegmentReport.getDreamTalkCount();
        Logger.i("MiHealth", "refreshDataTitleView: snoreDuration:" + snoreDuration + "-dreamTalkCount:" + dreamTalkCount);
        String string2 = null;
        if (snoreDuration == null || snoreDuration.intValue() <= 0) {
            string = null;
            strA = "";
        } else {
            strA = vmm.a(this.f30909b, snoreDuration.intValue() * 1000);
            string = this.f30909b.getString(c0j.ok, strA);
        }
        if (dreamTalkCount != null && dreamTalkCount.intValue() > 0) {
            string2 = this.f30909b.getString(c0j.Af, dreamTalkCount + " " + this.f30909b.getResources().getQuantityString(qxi.w0, dreamTalkCount.intValue()));
        }
        String str = String.format("%s-%s", TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getBedTime()), TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getWakeupTime()));
        if (string != null && string2 != null) {
            this.c.d(this.f30909b, str, String.format("%s，%s", string, string2), strA, dreamTalkCount.toString());
            return;
        }
        if (string != null) {
            this.c.a(this.f30909b, string, strA, str);
        } else if (string2 != null) {
            this.c.a(this.f30909b, string2, dreamTalkCount.toString(), str);
        } else {
            this.c.c("");
        }
    }

    public final void n(SleepSegmentReport sleepSegmentReport) {
        SleepAssistItemInfo snoreRecordInfo = sleepSegmentReport.getSnoreRecordInfo();
        long bedTime = sleepSegmentReport.getBedTime();
        long wakeupTime = sleepSegmentReport.getWakeupTime();
        Logger.i("MiHealth", "SleepSnoreAndDreamTalkHolder updateSleepSnoreRecordCard" + sleepSegmentReport.getSnoreRecordInfo());
        if (snoreRecordInfo == null || bedTime == 0 || wakeupTime == 0) {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        this.i.c(bedTime, wakeupTime);
        this.d.setVisibility(0);
        this.c.setVisibility(0);
        Logger.i("MiHealth", "SleepSnoreAndDreamTalkHolder.. snoreRecordInfo is " + snoreRecordInfo.toString() + "bedTime:" + bedTime + "wakeupTime:" + wakeupTime);
        long firstRecordTime = snoreRecordInfo.getFirstRecordTime();
        short sampleUnit = snoreRecordInfo.getSampleUnit();
        ArrayList arrayList = new ArrayList();
        Number[] values = snoreRecordInfo.getValues();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: oym
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pym.k((Long) obj, (Long) obj2);
            }
        });
        long j = (long) sampleUnit;
        int i = (int) ((firstRecordTime - bedTime) / j);
        int i2 = 0;
        while (i2 < i) {
            treeMap.put(Long.valueOf(((long) (i2 * sampleUnit)) + bedTime), Float.valueOf(0.0f));
            i2++;
            i = i;
            j = j;
        }
        long j2 = j;
        int i3 = 0;
        long jMax = 0;
        while (i3 < values.length) {
            short s = sampleUnit;
            long j3 = ((long) (i3 * sampleUnit)) + firstRecordTime;
            long j4 = firstRecordTime;
            Number number = values[i3];
            float fFloatValue = number instanceof LazilyParsedNumber ? number.floatValue() : ((Float) number).floatValue();
            if (j3 >= bedTime && j3 <= wakeupTime) {
                jMax = Math.max(jMax, j3);
                treeMap.put(Long.valueOf(j3), Float.valueOf(fFloatValue));
            }
            i3++;
            sampleUnit = s;
            firstRecordTime = j4;
        }
        short s2 = sampleUnit;
        if (jMax > 0) {
            int i4 = (int) ((wakeupTime - jMax) / j2);
            for (int i5 = 0; i5 < i4; i5++) {
                treeMap.put(Long.valueOf(wakeupTime - ((long) (i5 * s2))), Float.valueOf(0.0f));
            }
        }
        int size = treeMap.size();
        Logger.i("MiHealth", "SleepSnoreAndDreamTalkHolder, displayNumber:" + size);
        if (size == 0) {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Long l = (Long) ((Map.Entry) it.next()).getKey();
            long jLongValue = l.longValue();
            Float fValueOf = (Float) treeMap.get(l);
            if (fValueOf == null) {
                fValueOf = Float.valueOf(0.0f);
            }
            RecyclerBarEntry recyclerBarEntry = new RecyclerBarEntry(0, fValueOf.floatValue(), jLongValue, 3);
            recyclerBarEntry.localDate = TimeDateUtil.timestampToLocalDate(jLongValue);
            arrayList.add(recyclerBarEntry);
        }
        int theMaxNumber = (int) HealthUtil.getTheMaxNumber(arrayList);
        Logger.i("MiHealth", "SleepSnoreAndDreamTalkHolder, entriesMaxValue:" + theMaxNumber);
        if (theMaxNumber <= 0) {
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.c.setVisibility(0);
        this.f.clear();
        this.f.addAll(arrayList);
        vqr vqrVar = this.j;
        vqrVar.f37144a = size;
        this.i.setXAxis(vqrVar);
        float theMaxNumber2 = HealthUtil.getTheMaxNumber(this.f);
        rtr rtrVar = this.h;
        rtr rtrVarL = rtrVar.l(rtrVar, theMaxNumber2);
        this.h = rtrVarL;
        this.i.setYAxis(rtrVarL);
        this.e.notifyDataSetChanged();
        m(sleepSegmentReport);
    }

    public final void o(SleepSegmentReport sleepSegmentReport) {
        this.m.clear();
        ArrayList arrayList = new ArrayList();
        List<SnoreDreamTalkAudio> snoreAudioList = sleepSegmentReport.getSnoreAudioList();
        List<SnoreDreamTalkAudio> dreamTalkAudioList = sleepSegmentReport.getDreamTalkAudioList();
        StringBuilder sb = new StringBuilder();
        sb.append("refreshSnoreAndDreamTalkList snore size:");
        sb.append(snoreAudioList == null ? 0 : snoreAudioList.size());
        sb.append("-dreamTalkSize:");
        sb.append(dreamTalkAudioList == null ? 0 : dreamTalkAudioList.size());
        Logger.i("MiHealth", sb.toString());
        if (!ArrayUtils.isEmpty(snoreAudioList)) {
            g(arrayList, snoreAudioList);
        }
        if (!ArrayUtils.isEmpty(dreamTalkAudioList)) {
            g(arrayList, dreamTalkAudioList);
        }
        Logger.i("MiHealth", "refreshSnoreAndDreamTalkList final size:" + arrayList.size());
        this.m.addAll(arrayList);
        if (ArrayUtils.isEmpty(this.m)) {
            this.f30910k.setVisibility(8);
        } else {
            this.l.q();
            this.f30910k.setVisibility(0);
        }
        this.l.x(this.m);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public void p(SleepSegmentReport sleepSegmentReport, boolean z) {
        if (!(RomUtils.isXiaomi() && z) && sleepSegmentReport.audioDataIsEmpty()) {
            this.f30908a.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.n.setVisibility(8);
            return;
        }
        if (!sleepSegmentReport.audioDataIsEmpty()) {
            this.f30908a.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.n.setVisibility(8);
            n(sleepSegmentReport);
            o(sleepSegmentReport);
            return;
        }
        this.f30908a.setVisibility(0);
        this.n.setVisibility(0);
        TextView textView = (TextView) this.f30908a.findViewById(eri.D4);
        Drawable drawable = this.f30909b.getDrawable(pni.f30561b);
        drawable.setBounds(0, 0, DisplayUtil.dip2px(8.0f), DisplayUtil.dip2px(9.0f));
        textView.setCompoundDrawables(null, null, drawable, null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: nym
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28571a.l(view);
            }
        });
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }
}

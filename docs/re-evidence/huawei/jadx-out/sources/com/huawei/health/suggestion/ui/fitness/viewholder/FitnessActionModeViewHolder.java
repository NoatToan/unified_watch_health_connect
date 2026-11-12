package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionModeViewHolder;
import com.huawei.hmf.services.codec.TypeToken;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.gzx;
import defpackage.hjg;
import defpackage.ied;
import defpackage.njy;
import defpackage.pea;
import defpackage.peh;
import defpackage.qri;
import defpackage.qrs;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessActionModeViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<c> f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f9460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f9461c;
    private Context d;
    private AtomicAction e;
    private List<c> f;
    private HealthTextView g;
    private int h;
    private View i;
    private List<c> j;
    private HealthTextView l;
    private int m;
    private HealthTextView n;

    public FitnessActionModeViewHolder(Context context, int i, AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("Suggestion_FitnessActionModeViewHolder", "FitnessActionModeViewHolder atomicAction == null");
            return;
        }
        this.h = i;
        this.e = atomicAction;
        this.d = context == null ? BaseApplication.b() : context;
        this.i = View.inflate(context, R.layout.sug_action_mode_select, null);
        this.f9459a = a(true);
        this.j = a(false);
        this.f9461c = c(true);
        this.f = c(false);
        f();
        j();
    }

    private void j() {
        if (this.e == null) {
            LogUtil.j("Suggestion_FitnessActionModeViewHolder", "initDataView mAtomicAction ==  null");
            return;
        }
        int i = this.h;
        if (i == -1) {
            k();
            return;
        }
        if (i == 1) {
            n();
            h();
        } else if (i == 10) {
            n();
            g();
        } else {
            LogUtil.a("Suggestion_FitnessActionModeViewHolder", "initDataView mTargetType:", Integer.valueOf(i));
        }
    }

    private void g() {
        ActionMode actionModeB = b(this.e.getId());
        if (actionModeB == null) {
            LogUtil.a("Suggestion_FitnessActionModeViewHolder", "initCountView actionMode == null");
            e(10);
        } else if (actionModeB.getTargetType() == 10) {
            e(actionModeB.getTargetValue());
        } else {
            e(10);
        }
    }

    private void e(int i) {
        this.m = i;
        String strE = UnitUtil.e(i, 1, 0);
        SpannableString spannableString = new SpannableString(gzx.d(R.plurals.IDS_me_group_count, i, strE));
        qri.b(spannableString, strE, R.color.textColorPrimary);
        Context context = this.d;
        qri.d(spannableString, strE, qrs.e(context, context.getResources().getDimensionPixelSize(R.dimen.textSizeHeadline4)));
        qri.e(spannableString, strE, R.string.textFontFamilyMedium);
        this.n.setText(spannableString);
        b(i);
    }

    private void b(int i) {
        long jD = d(this.e);
        float extendPropertyFloat = this.e.getExtendPropertyFloat("calorie");
        ReleaseLogUtil.d("Suggestion_FitnessActionModeViewHolder", "calorieByCountView duration:", Long.valueOf(jD), "calorie:", Float.valueOf(extendPropertyFloat));
        float fA = pea.a(jD, i, extendPropertyFloat, hjg.a());
        this.l.setText(d(gzx.c(this.d, R.string.IDS_consume_calorie, gzx.d(R.plurals.sug_chart_kcals, (int) fA, UnitUtil.e(fA, 1, 0))), R.style.health_text_chart_extreme_value_small, R.style.health_text_chart_cursor_unit));
    }

    public static long d(AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("Suggestion_FitnessActionModeViewHolder", "getDuration atomicAction null");
            return 0L;
        }
        long extendPropertyLong = atomicAction.getExtendPropertyLong("duration");
        List<Video> extendPropertyList = atomicAction.getExtendPropertyList("actionVideo", Video[].class);
        if (njy.e(extendPropertyList)) {
            LogUtil.j("Suggestion_FitnessActionModeViewHolder", "getDuration videos isEmpty");
            return extendPropertyLong;
        }
        int iE = ied.e();
        ReleaseLogUtil.d("Suggestion_FitnessActionModeViewHolder", "getDuration duration:", Long.valueOf(extendPropertyLong), "coachGender:", Integer.valueOf(iE));
        for (Video video : extendPropertyList) {
            if (video != null && iE == video.getGender()) {
                int during = video.getDuring();
                if (during != 0) {
                    extendPropertyLong = during;
                }
                int actionCount = video.getActionCount();
                ReleaseLogUtil.d("Suggestion_FitnessActionModeViewHolder", "getDuration isMatch true actionCount", Integer.valueOf(actionCount), "coachGender:", Integer.valueOf(video.getGender()), "videoDuring:", Integer.valueOf(during));
                if (actionCount != 0) {
                    return extendPropertyLong / ((long) actionCount);
                }
            }
        }
        return extendPropertyLong;
    }

    private void h() {
        ActionMode actionModeB = b(this.e.getId());
        if (actionModeB == null) {
            LogUtil.a("Suggestion_FitnessActionModeViewHolder", "initTimeView actionMode == null");
            d(60);
        } else if (actionModeB.getTargetType() == 1) {
            d(actionModeB.getTargetValue());
        } else {
            d(60);
        }
    }

    private void d(int i) {
        this.m = i;
        this.n.setText(d(gzx.b(i), R.style.health_ai_action_time_value, R.style.health_ai_action_time_unit));
        a(i);
    }

    private void a(int i) {
        float extendPropertyFloat = this.e.getExtendPropertyFloat("calorie");
        ReleaseLogUtil.d("Suggestion_FitnessActionModeViewHolder", "calorieByCountView calorie:", Float.valueOf(extendPropertyFloat));
        float fA = pea.a(extendPropertyFloat, i, hjg.a());
        this.l.setText(d(gzx.c(this.d, R.string.IDS_consume_calorie, gzx.d(R.plurals.sug_chart_kcals, (int) fA, UnitUtil.e(fA, 1, 0))), R.style.health_text_chart_extreme_value_small, R.style.health_text_chart_cursor_unit));
    }

    private SpannableString d(String str, int i, int i2) {
        return UnitUtil.b(this.d, "\\d", str, i, i2);
    }

    private void k() {
        this.f9460b.setVisibility(8);
        this.l.setVisibility(8);
        this.g.setVisibility(0);
    }

    private void n() {
        this.f9460b.setVisibility(0);
        this.l.setVisibility(0);
        this.g.setVisibility(8);
    }

    private void f() {
        this.n = (HealthTextView) this.i.findViewById(R.id.action_target_value);
        ((HealthImageView) this.i.findViewById(R.id.value_reduce_img)).setOnClickListener(this);
        ((HealthImageView) this.i.findViewById(R.id.value_add_img)).setOnClickListener(this);
        this.l = (HealthTextView) this.i.findViewById(R.id.action_total_calorie);
        this.f9460b = (LinearLayout) this.i.findViewById(R.id.action_mode_layout);
        this.g = (HealthTextView) this.i.findViewById(R.id.free_target);
    }

    public View b() {
        return this.i;
    }

    public int a() {
        return this.m;
    }

    public int d() {
        return this.h;
    }

    public String c() {
        HealthTextView healthTextView;
        return (this.h == -1 || (healthTextView = this.n) == null || healthTextView.getText() == null) ? "" : this.n.getText().toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.value_reduce_img) {
            l();
        } else if (id == R.id.value_add_img) {
            e();
        }
    }

    private void e() {
        if (this.h == 10) {
            b("count", 1000, this.f9459a);
            e(this.m);
        } else {
            b("time", 3600, this.f9461c);
            d(this.m);
        }
    }

    private void b(String str, int i, List<c> list) {
        if (this.m >= i) {
            this.m = i;
            LogUtil.a("Suggestion_FitnessActionModeViewHolder", "addTargetValue mTargetValue >= MAX_VALUE tag:", str);
            return;
        }
        for (c cVar : list) {
            if (this.m >= cVar.e()) {
                this.m += cVar.d();
                return;
            }
        }
    }

    private List<c> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(1000, 100));
        arrayList.add(new c(500, 100));
        arrayList.add(new c(100, 50));
        arrayList.add(new c(10, 10));
        arrayList.add(new c(5, 5));
        if (z) {
            return arrayList;
        }
        Collections.sort(arrayList, new Comparator() { // from class: hng
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FitnessActionModeViewHolder.b((FitnessActionModeViewHolder.c) obj, (FitnessActionModeViewHolder.c) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int b(c cVar, c cVar2) {
        return cVar.e() - cVar2.e();
    }

    private List<c> c(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(3600, 600));
        arrayList.add(new c(1800, 600));
        arrayList.add(new c(600, 300));
        arrayList.add(new c(300, 60));
        arrayList.add(new c(30, 30));
        if (z) {
            return arrayList;
        }
        Collections.sort(arrayList, new Comparator() { // from class: hnh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return FitnessActionModeViewHolder.d((FitnessActionModeViewHolder.c) obj, (FitnessActionModeViewHolder.c) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int d(c cVar, c cVar2) {
        return cVar.e() - cVar2.e();
    }

    private void l() {
        if (this.h == 10) {
            c("count", 5, this.j);
            e(this.m);
        } else {
            c("time", 30, this.f);
            d(this.m);
        }
    }

    private void c(String str, int i, List<c> list) {
        if (this.m <= i) {
            this.m = i;
            LogUtil.a("Suggestion_FitnessActionModeViewHolder", "reduceCountValue mTargetValue <= minTargetValue tag:", str);
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar != null && this.m <= cVar.e()) {
                int i3 = i2 - 1;
                if (njy.c(list, i3)) {
                    this.m -= list.get(i3).d();
                    return;
                }
            }
        }
    }

    public static void a(String str, int i, int i2) {
        Map mapI = i();
        if (mapI == null) {
            mapI = new HashMap(10);
        }
        ActionMode actionMode = new ActionMode();
        actionMode.setTargetType(i);
        actionMode.setTargetValue(i2);
        mapI.put(str, actionMode);
        SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "ACTION_ MODE_SP", peh.c(mapI));
    }

    private static Map<String, ActionMode> i() {
        String strB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "ACTION_ MODE_SP", "");
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e("Suggestion_FitnessActionModeViewHolder", "getSelectedActionModSp actionMode null");
            return null;
        }
        return (Map) peh.d(strB, new TypeToken<Map<String, ActionMode>>() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionModeViewHolder.5
        }.getType());
    }

    public static ActionMode b(String str) {
        Map<String, ActionMode> mapI = i();
        if (mapI == null || str == null) {
            ReleaseLogUtil.e("Suggestion_FitnessActionModeViewHolder", "getLastActionMode modeMap == null || actionId == null");
            return null;
        }
        for (Map.Entry<String, ActionMode> entry : mapI.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static class ActionMode implements Parcelable {
        public static final Parcelable.Creator<ActionMode> CREATOR = new Parcelable.Creator<ActionMode>() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionModeViewHolder.ActionMode.3
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ActionMode createFromParcel(Parcel parcel) {
                return new ActionMode(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ActionMode[] newArray(int i) {
                return new ActionMode[i];
            }
        };
        private int mTargetType;
        private int mTargetValue;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActionMode() {
        }

        public ActionMode(Parcel parcel) {
            this.mTargetType = parcel.readInt();
            this.mTargetValue = parcel.readInt();
        }

        public int getTargetType() {
            return this.mTargetType;
        }

        public void setTargetType(int i) {
            this.mTargetType = i;
        }

        public int getTargetValue() {
            return this.mTargetValue;
        }

        public void setTargetValue(int i) {
            this.mTargetValue = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mTargetType);
            parcel.writeInt(this.mTargetValue);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9462b;
        private final int d;

        public c(int i, int i2) {
            this.f9462b = i;
            this.d = i2;
        }

        public int e() {
            return this.f9462b;
        }

        public int d() {
            return this.d;
        }
    }
}

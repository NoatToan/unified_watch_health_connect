package com.huawei.pluginachievement.ui.kakatask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import defpackage.njy;
import defpackage.ozs;
import defpackage.ozu;
import defpackage.pap;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveKaKaTaskRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<ozs> f22218c;
    private AchieveKaKaTaskClickListener d;
    private Context e;
    private int g;
    private int h;
    private int j;

    private int a(boolean z) {
        return z ? 1 : 0;
    }

    public AchieveKaKaTaskRVAdapter(Context context, ArrayList<ozs> arrayList) {
        new ArrayList(0);
        this.e = context;
        this.f22218c = arrayList;
    }

    public ArrayList<ozs> b(ArrayList<ozs> arrayList, int i, int i2) {
        if (njy.e(arrayList)) {
            return arrayList;
        }
        c(arrayList);
        this.j = i;
        this.f22216a = i2;
        boolean z = false;
        this.g = 0;
        if (i == 1 && i2 == 1) {
            this.f22218c = arrayList;
            for (ozs ozsVar : arrayList) {
                ozu ozuVarE = ozsVar.e();
                if (ozuVarE != null && pap.e(ozuVarE.k())) {
                    if (ozsVar.f() && ozsVar.b()) {
                        z = true;
                    }
                    this.g = a(z);
                    break;
                }
            }
            notifyDataSetChanged();
            return this.f22218c;
        }
        ArrayList<ozs> arrayList2 = new ArrayList<>(2);
        ArrayList<ozs> arrayList3 = new ArrayList<>(2);
        boolean z2 = false;
        int i3 = 0;
        for (ozs ozsVar2 : arrayList) {
            ozu ozuVarE2 = ozsVar2.e();
            if (this.e.getString(R.string.IDS_plugin_achievement_kaka_newbie).equals(ozsVar2.c())) {
                arrayList2.add(ozsVar2);
            } else if (this.e.getString(R.string.IDS_plugin_achievement_kaka_daily).equals(ozsVar2.c())) {
                arrayList3.add(ozsVar2);
            } else if (ozuVarE2 != null) {
                boolean zE = pap.e(ozuVarE2.k());
                boolean z3 = !z2 || this.j == 1;
                if (zE && z3) {
                    arrayList2.add(ozsVar2);
                    z2 = true;
                } else {
                    boolean z4 = i3 < 3 || this.f22216a == 1;
                    if (!zE && z4) {
                        i3++;
                        arrayList3.add(ozsVar2);
                    }
                }
            }
        }
        this.f22218c = e(arrayList2, arrayList3);
        notifyDataSetChanged();
        return this.f22218c;
    }

    private void c(ArrayList<ozs> arrayList) {
        Map<String, Object> mapC = pap.c(arrayList, 1);
        if (mapC.containsKey("task_size")) {
            Object obj = mapC.get("task_size");
            if (obj instanceof Integer) {
                this.h = ((Integer) obj).intValue();
            }
        }
        if (mapC.containsKey("finish_count")) {
            Object obj2 = mapC.get("finish_count");
            if (obj2 instanceof Integer) {
                this.f22217b = ((Integer) obj2).intValue();
            }
        }
        LogUtil.a("AchieveKaKaTaskRVAdapter", "checkTaskFinishInfo taskSize ", Integer.valueOf(this.h), " finishCount ", Integer.valueOf(this.f22217b));
    }

    private ArrayList<ozs> e(ArrayList<ozs> arrayList, ArrayList<ozs> arrayList2) {
        ArrayList<ozs> arrayList3 = new ArrayList<>(0);
        d(arrayList3, arrayList);
        b(arrayList3, arrayList, arrayList2);
        return arrayList3;
    }

    private void b(ArrayList<ozs> arrayList, ArrayList<ozs> arrayList2, ArrayList<ozs> arrayList3) {
        if (njy.e(arrayList3)) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            if (arrayList3.get(i2).e() == null) {
                arrayList.add(arrayList3.get(i2));
            } else {
                ozs ozsVar = new ozs();
                ozsVar.c(arrayList3.get(i2).a());
                ozsVar.a(arrayList3.get(i2).c());
                ozsVar.a(arrayList3.get(i2).e());
                ozsVar.b(arrayList3.get(i2).d());
                ozsVar.e(arrayList3.get(i2).f());
                if (i2 == arrayList3.size() - 1) {
                    ozsVar.c(true);
                }
                arrayList.add(ozsVar);
                i++;
                if (a(arrayList2, i)) {
                    ozsVar.c(true);
                    return;
                }
            }
        }
    }

    private void d(ArrayList<ozs> arrayList, ArrayList<ozs> arrayList2) {
        if (njy.e(arrayList2)) {
            return;
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i).e() == null) {
                arrayList.add(arrayList2.get(i));
            } else {
                ozs ozsVar = new ozs();
                ozsVar.c(arrayList2.get(i).a());
                ozsVar.a(arrayList2.get(i).c());
                ozsVar.a(arrayList2.get(i).e());
                ozsVar.b(arrayList2.get(i).d());
                ozsVar.e(arrayList2.get(i).f());
                this.g = a(arrayList2.get(i).f() == arrayList2.get(i).b());
                if (i == arrayList2.size() - 1) {
                    ozsVar.c(true);
                }
                arrayList.add(ozsVar);
            }
        }
    }

    private boolean a(ArrayList<ozs> arrayList, int i) {
        int i2;
        int i3;
        if (this.f22216a == 1) {
            return false;
        }
        if (!njy.e(arrayList) || (i2 = this.f22217b) == (i3 = this.h)) {
            return i == 1;
        }
        int i4 = i3 - i2;
        if (i4 >= 3) {
            return i == 3;
        }
        if (i4 == 2) {
            return i == 2;
        }
        return i == 1;
    }

    public void d(AchieveKaKaTaskClickListener achieveKaKaTaskClickListener) {
        this.d = achieveKaKaTaskClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        if (i == 0) {
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.achieve_task_ka_ka_title, viewGroup, false);
            viewInflate.setLayoutParams(layoutParams);
            return new AchieveKaKaTaskTitleHolder(viewInflate);
        }
        if (i == 1) {
            View viewInflate2 = LayoutInflater.from(this.e).inflate(R.layout.achieve_task_ka_ka_content, viewGroup, false);
            viewInflate2.setLayoutParams(layoutParams);
            return new AchieveKaKaTaskContentHolder(viewInflate2, this.d);
        }
        LogUtil.j("AchieveKaKaTaskRVAdapter", "viewType unknow:", Integer.valueOf(i));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < 0 || i >= this.f22218c.size()) {
            return;
        }
        viewHolder.setIsRecyclable(false);
        ozs ozsVar = this.f22218c.get(i);
        if (ozsVar != null) {
            if (viewHolder instanceof AchieveKaKaTaskTitleHolder) {
                ((AchieveKaKaTaskTitleHolder) viewHolder).b(ozsVar, this.f22217b, this.h);
            } else {
                if (viewHolder instanceof AchieveKaKaTaskContentHolder) {
                    AchieveKaKaTaskContentHolder achieveKaKaTaskContentHolder = (AchieveKaKaTaskContentHolder) viewHolder;
                    achieveKaKaTaskContentHolder.a(this.g);
                    achieveKaKaTaskContentHolder.c(ozsVar, i, this.j, this.f22216a, this.f22217b == this.h);
                    return;
                }
                LogUtil.d("AchieveKaKaTaskRVAdapter", "onBindViewHolder holder is not matching");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f22218c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (njy.e(this.f22218c, i)) {
            LogUtil.e("AchieveKaKaTaskRVAdapter", "getItemViewType isOutOfBounds");
            return -1;
        }
        return this.f22218c.get(i).a();
    }
}

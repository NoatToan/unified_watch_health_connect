package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.skw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementNotShowViewAdapter extends RecyclerView.Adapter<FunctionSetCardManagementDeleteChineseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<skw> f25481a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25483c;
    private FunctionSetCardManagementActivity d;
    private List<skw> g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<skw> f25482b = new ArrayList();
    private boolean e = true;

    public FunctionSetCardManagementNotShowViewAdapter(List<skw> list, FunctionSetCardManagementActivity functionSetCardManagementActivity) {
        ArrayList arrayList = new ArrayList(list);
        this.f25481a = arrayList;
        LogUtil.a("FunctionSetCardManagementViewAdapter", "mDataList: ", arrayList);
        this.d = functionSetCardManagementActivity;
        this.f25483c = functionSetCardManagementActivity;
        e();
    }

    private void e() {
        d();
        b();
        for (int i = 0; i < this.g.size(); i++) {
            this.g.get(i).c(i);
        }
        for (int i2 = 0; i2 < this.f25482b.size(); i2++) {
            this.f25482b.get(i2).c(i2 + 1000);
        }
        Collections.sort(this.f25481a);
        LogUtil.a("FunctionSetCardManagementViewAdapter", "mDataList: ", this.f25481a);
        LogUtil.a("FunctionSetCardManagementViewAdapter", "mShowedDataList: ", this.g);
        LogUtil.a("FunctionSetCardManagementViewAdapter", "mNotShowedDataList: ", this.f25482b);
    }

    private void d() {
        this.g.clear();
        List<skw> list = this.f25481a;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "getShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() == 1) {
                this.g.add(skwVar);
            }
        }
    }

    private void b() {
        this.f25482b.clear();
        List<skw> list = this.f25481a;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "getNotShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() != 1) {
                this.f25482b.add(skwVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FunctionSetCardManagementDeleteChineseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FunctionSetCardManagementDeleteChineseViewHolder(LayoutInflater.from(this.f25483c).inflate(R.layout.function_set_management_view_card_delete_chinese, viewGroup, false), this.f25483c, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FunctionSetCardManagementDeleteChineseViewHolder functionSetCardManagementDeleteChineseViewHolder, final int i) {
        List<skw> list;
        if (functionSetCardManagementDeleteChineseViewHolder == null || (list = this.f25482b) == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "holder or mDataList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "position is wrong :", Integer.valueOf(i));
            return;
        }
        d(functionSetCardManagementDeleteChineseViewHolder.itemView, i);
        functionSetCardManagementDeleteChineseViewHolder.setIsRecyclable(false);
        LogUtil.d("FunctionSetCardManagementViewAdapter", "DeleteViewHolder cardName:", this.f25482b.get(i).c(), "position", Integer.valueOf(i));
        functionSetCardManagementDeleteChineseViewHolder.b(this.f25482b.get(i), this.e);
        e(functionSetCardManagementDeleteChineseViewHolder.d(), i);
        functionSetCardManagementDeleteChineseViewHolder.b().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementNotShowViewAdapter.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                LogUtil.a("FunctionSetCardManagementViewAdapter", "not show card is long clicked, position: ", Integer.valueOf(i));
                if (FunctionSetCardManagementNotShowViewAdapter.this.e) {
                    return false;
                }
                FunctionSetCardManagementNotShowViewAdapter.this.d.e(true);
                return false;
            }
        });
    }

    private void d(View view, int i) {
        if (view.getLayoutParams() instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f25483c.getResources().getDimensionPixelSize(R.dimen.health_common_6dp);
            int dimensionPixelSize2 = this.f25483c.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize3 = this.f25483c.getResources().getDimensionPixelSize(R.dimen.health_common_0dp);
            int dimensionPixelSize4 = this.f25483c.getResources().getDimensionPixelSize(R.dimen.health_common_6dp);
            if (qrs.ah(this.f25483c) || qrs.af(this.f25483c)) {
                int i2 = i % 4;
                if (i2 == 0) {
                    layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
                } else if (i2 == 3) {
                    layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize4);
                } else {
                    layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
                }
            } else if (i % 2 == 0) {
                layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
            } else {
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize4);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private void e(ImageView imageView, final int i) {
        if (njy.e(this.f25482b, i)) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setAddOnClick : position is out of bounds", Integer.valueOf(i));
        } else {
            lrd.a(imageView, qre.f(R.string.IDS_contact_add), (Class<?>) ImageView.class);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementNotShowViewAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i2 = i;
                    if (i2 >= 0 && i2 < FunctionSetCardManagementNotShowViewAdapter.this.f25482b.size()) {
                        FunctionSetCardManagementNotShowViewAdapter.this.e(i);
                    } else {
                        LogUtil.j("FunctionSetCardManagementViewAdapter", "setAddOnClick : position is wrong :", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i < 0 || i >= this.f25482b.size()) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setItemAddStatus : position is wrong :", Integer.valueOf(i));
            return;
        }
        LogUtil.a("FunctionSetCardManagementViewAdapter", "setItemAddStatus position = ", Integer.valueOf(i));
        this.f25482b.get(i).e(1);
        e();
        notifyDataSetChanged();
        FunctionSetCardManagementActivity functionSetCardManagementActivity = this.d;
        if (functionSetCardManagementActivity != null) {
            functionSetCardManagementActivity.c(i + this.g.size(), this.g.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f25482b.size();
    }

    public void d(int i) {
        e();
        notifyDataSetChanged();
    }

    public void e(boolean z) {
        this.e = z;
        notifyDataSetChanged();
    }

    public void b(final List<skw> list) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementNotShowViewAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardManagementNotShowViewAdapter.this.b(list);
                }
            });
            return;
        }
        this.f25481a.clear();
        this.f25481a.addAll(list);
        e();
        notifyDataSetChanged();
    }
}

package com.huawei.ui.device.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.device.R;
import defpackage.rbe;
import defpackage.rfl;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class ScanDeviceAdapter extends RecyclerView.Adapter<RecyclerHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f24886b = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: com.huawei.ui.device.adapter.ScanDeviceAdapter.1
        {
            put("HDK_WEIGHT", Integer.valueOf(R.mipmap.one_key_icon_body_fat));
            put("HDK_BLOOD_SUGAR", Integer.valueOf(R.mipmap.one_key_icon_blood_sugar));
            put("HDK_BLOOD_PRESSURE", Integer.valueOf(R.mipmap.one_key_icon_blood_pressure));
            put("HDK_HEART_RATE", Integer.valueOf(R.mipmap.one_key_icon_heart_rate));
            put("HDK_BODY_TEMPERATURE", Integer.valueOf(R.mipmap.one_key_icon_temperature));
            put("HDK_BLOOD_OXYGEN", Integer.valueOf(R.mipmap.one_key_icon_blood_oxygen));
            put("HDK_ROPE_SKIPPING", Integer.valueOf(R.mipmap.one_key_icon_rope_skipping));
            put("HDK_TREADMILL", Integer.valueOf(R.mipmap.one_key_icon_treadmill));
            put("HDK_EXERCISE_BIKE", Integer.valueOf(R.mipmap.one_key_icon_exercise_bike));
            put("HDK_ROWING_MACHINE", Integer.valueOf(R.mipmap.one_key_icon_rowing_machine));
            put("HDK_ELLIPTICAL_MACHINE", Integer.valueOf(R.mipmap.one_key_icon_elliptical));
            put("HDK_WALKING_MACHINE", Integer.valueOf(R.mipmap.one_key_icon_walking_machine));
            put("HDK_ECG", Integer.valueOf(R.mipmap.one_key_icon_ecg));
            put("HDK_SMART_PILLOW", Integer.valueOf(R.mipmap.one_key_icon_smart_pillow));
            put("HDK_MASSAGE_GUN", Integer.valueOf(R.mipmap.one_key_icon_massage_gun));
            put("SMART_HEADPHONES", Integer.valueOf(R.mipmap.one_key_icon_smart_headphones));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseRecyclerAdapter.OnItemClickListener f24887a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24888c;
    private AsyncListDiffer<rbe> d;
    private boolean e = false;
    private RecyclerHolder j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    static class b extends DiffUtil.ItemCallback<rbe> {
        private b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(rbe rbeVar, rbe rbeVar2) {
            LogUtil.a("ScanDeviceAdapter", "areItemsTheSame: ", rbeVar, "  ", rbeVar2);
            if (rbeVar == null || rbeVar2 == null) {
                return true;
            }
            return rbeVar.equals(rbeVar2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(rbe rbeVar, rbe rbeVar2) {
            LogUtil.a("ScanDeviceAdapter", "areContentsTheSame: ", rbeVar, "  ", rbeVar2);
            if (rbeVar == null || rbeVar2 == null) {
                return true;
            }
            return rbeVar.equals(rbeVar2);
        }
    }

    public ScanDeviceAdapter(BaseRecyclerAdapter.OnItemClickListener<rbe> onItemClickListener) {
        if (this.d == null) {
            this.d = new AsyncListDiffer<>(this, new b());
        }
        this.f24888c = R.layout.activity_one_key_scan_item;
        this.f24887a = onItemClickListener;
        c((List<rbe>) null);
        LogUtil.a("ScanDeviceAdapter", "ScanDeviceAdapter init");
    }

    public ScanDeviceAdapter(BaseRecyclerAdapter.OnItemClickListener<rbe> onItemClickListener, boolean z) {
        if (this.d == null) {
            this.d = new AsyncListDiffer<>(this, new b());
        }
        this.f24888c = R.layout.activity_three_fold_one_key_scan_item;
        this.f24887a = onItemClickListener;
        c((List<rbe>) null);
        LogUtil.a("ScanDeviceAdapter", "ThreeFold ScanDeviceAdapter isThreeFoldFontsFlag : ", Boolean.valueOf(z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public RecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f24888c, viewGroup, false);
        if (i == 0) {
            viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_scan_radarview, viewGroup, false);
        }
        RecyclerHolder recyclerHolder = new RecyclerHolder(viewInflate);
        a(recyclerHolder.itemView);
        LogUtil.a("ScanDeviceAdapter", "onCreateViewHolder: initAnim");
        return recyclerHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final RecyclerHolder recyclerHolder, int i) {
        if (i == 0) {
            if (this.j != null) {
                return;
            }
            this.j = recyclerHolder;
            BaseRecyclerAdapter.OnItemClickListener onItemClickListener = this.f24887a;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClicked(recyclerHolder, i, null);
                return;
            }
            return;
        }
        final rbe rbeVar = this.d.getCurrentList().get(i);
        b(recyclerHolder, rbeVar);
        LogUtil.a("ScanDeviceAdapter", "onBindViewHolder");
        if (recyclerHolder.itemView != null) {
            recyclerHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.adapter.ScanDeviceAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int iIndexOf = ScanDeviceAdapter.this.d.getCurrentList().indexOf(rbeVar);
                    if (ScanDeviceAdapter.this.f24887a != null) {
                        ScanDeviceAdapter.this.f24887a.onItemClicked(recyclerHolder, iIndexOf, rbeVar);
                    }
                }
            });
        }
        if (this.e) {
            c(recyclerHolder.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.getCurrentList().size();
    }

    private void c(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 100.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        animatorSet.setDuration(350L);
        animatorSet.setStartDelay(50L);
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.start();
    }

    private void a(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 100.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f, 1.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new rfl(0.2f, 0.0f, 0.2f, 1.0f));
        animatorSet.setDuration(300L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    public void b(final RecyclerHolder recyclerHolder, final rbe rbeVar) {
        if (rbeVar != null) {
            recyclerHolder.a(R.id.scan_device_name, rbeVar.c());
            if ("wear_watch".equals(rbeVar.i())) {
                recyclerHolder.c(R.id.scan_device_icon, R.mipmap.one_key_icon_watch);
            } else if ("wear_band".equals(rbeVar.i())) {
                recyclerHolder.c(R.id.scan_device_icon, R.mipmap.one_key_icon_band);
            } else if ("continuous_glucose".equals(rbeVar.i())) {
                recyclerHolder.c(R.id.scan_device_icon, R.mipmap.one_key_icon_blood_sugar);
            } else if ("SPORTS_GENIE".equals(rbeVar.i())) {
                recyclerHolder.c(R.id.scan_device_icon, R.mipmap.one_key_icon_sports_genie);
            } else {
                LogUtil.a("ScanDeviceAdapter", "Other third devices");
                Map<String, Integer> map = f24886b;
                if (map.containsKey(rbeVar.i())) {
                    recyclerHolder.c(R.id.scan_device_icon, map.get(rbeVar.i()).intValue());
                } else {
                    LogUtil.a("ScanDeviceAdapter", "Invalid device kindId");
                }
            }
            recyclerHolder.e(R.id.scan_device_connect, new View.OnClickListener() { // from class: com.huawei.ui.device.adapter.ScanDeviceAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("ScanDeviceAdapter", "convert onClick deviceName:", rbeVar.c());
                    rbe rbeVar2 = rbeVar;
                    if (rbeVar2 != null) {
                        SharedPreferenceManager.c(String.valueOf(10), "app_big_data_device_name", rbeVar2.c());
                    }
                    ScanDeviceAdapter.this.f24887a.onItemClicked(recyclerHolder, ScanDeviceAdapter.this.d.getCurrentList().indexOf(rbeVar), rbeVar);
                }
            });
        }
    }

    public void c(List<rbe> list) {
        if (this.e) {
            return;
        }
        if (list == null && (this.d.getCurrentList().size() > 1 || this.d.getCurrentList().size() == 0)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            this.d.submitList(arrayList);
        } else if (list != null) {
            list.add(0, null);
            this.d.submitList(list);
        }
    }

    public void e(boolean z) {
        LogUtil.a("ScanDeviceAdapter", "setUpValue:", Boolean.valueOf(z));
        this.e = z;
    }

    public void b(BaseRecyclerAdapter.OnItemClickListener onItemClickListener) {
        this.f24887a = onItemClickListener;
    }

    public List<rbe> e() {
        return this.d.getCurrentList();
    }
}

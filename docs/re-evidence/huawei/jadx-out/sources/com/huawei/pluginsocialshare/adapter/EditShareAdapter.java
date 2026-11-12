package com.huawei.pluginsocialshare.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.cloud.bean.DownloadCallback;
import com.huawei.pluginsocialshare.view.ShareRecycleScrollItemView;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.plg;
import defpackage.pmb;
import defpackage.pmu;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class EditShareAdapter extends RecyclerView.Adapter<RecyclerHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f22462b;
    private c e;
    private Context f;
    private int[][] g;
    private ShareRecycleScrollItemView h;
    private int i;
    private int k;
    private OnBackgroundChangeListener l;
    private int[][] m;
    private HealthRecycleView n;
    private OnMoreListener o;
    private List<ShareDataInfo> p;
    private int r;
    private List<ShareDataInfo> d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ShareDataInfo f22461a = new pmu();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22463c = -1;
    private Handler j = new Handler() { // from class: com.huawei.pluginsocialshare.adapter.EditShareAdapter.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("share_EditShareAdapter", "receive empty msg");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    LogUtil.a("share_EditShareAdapter", "MSG_DOWNLOAD_THEME_FAIL");
                    qpx.b(EditShareAdapter.this.f22462b.getApplicationContext(), R.string.IDS_hwh_edit_share_error);
                    return;
                }
                if (i != 3) {
                    LogUtil.j("share_EditShareAdapter", "msg unknown");
                    return;
                }
                if (message.obj instanceof ShareRecycleScrollItemView) {
                    ShareRecycleScrollItemView shareRecycleScrollItemView = (ShareRecycleScrollItemView) message.obj;
                    if (shareRecycleScrollItemView.getShareDataInfo() instanceof plg) {
                        plg plgVar = (plg) shareRecycleScrollItemView.getShareDataInfo();
                        EditShareAdapter editShareAdapter = EditShareAdapter.this;
                        editShareAdapter.e(plgVar, shareRecycleScrollItemView, editShareAdapter.e);
                        return;
                    }
                    return;
                }
                return;
            }
            if (message.obj instanceof ShareRecycleScrollItemView) {
                ShareRecycleScrollItemView shareRecycleScrollItemView2 = (ShareRecycleScrollItemView) message.obj;
                shareRecycleScrollItemView2.setShowSelected(true);
                shareRecycleScrollItemView2.setDownloading(EditShareAdapter.this.f22462b, false);
                shareRecycleScrollItemView2.setShowDown(false);
                shareRecycleScrollItemView2.setShowNew(false);
                if (EditShareAdapter.this.h != null) {
                    EditShareAdapter.this.h.setShowSelected(false);
                }
                EditShareAdapter.this.h = shareRecycleScrollItemView2;
                EditShareAdapter.this.k = message.arg1;
                if (EditShareAdapter.this.l != null) {
                    EditShareAdapter.this.l.onBackgroundChange(EditShareAdapter.this.i, message.arg1, shareRecycleScrollItemView2);
                }
            }
        }
    };

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnBackgroundChangeListener {
        void onBackgroundChange(int i, int i2, View view);
    }

    public interface OnMoreListener {
        void onLoadingMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public EditShareAdapter(Activity activity, HealthRecycleView healthRecycleView, int i, OnBackgroundChangeListener onBackgroundChangeListener, int i2) {
        this.i = i2;
        if (healthRecycleView == null) {
            LogUtil.j("share_EditShareAdapter", "recyclerView == null");
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.f = activity.getApplicationContext();
        this.f22462b = activity;
        this.n = healthRecycleView;
        if (healthRecycleView.getItemAnimator() instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) this.n.getItemAnimator()).setSupportsChangeAnimations(false);
        }
        this.n.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.pluginsocialshare.adapter.EditShareAdapter.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                super.onScrolled(recyclerView, i3, i4);
                if (recyclerView.canScrollHorizontally(1) || EditShareAdapter.this.o == null) {
                    return;
                }
                EditShareAdapter.this.o.onLoadingMore();
            }
        });
        this.l = onBackgroundChangeListener;
        this.r = qrs.d(this.f, 80.0f);
    }

    public void a(int i) {
        this.k = i;
        int iA = d.a(this.n);
        boolean zE = d.e(this.n);
        if (iA > 1 && this.i == 1 && zE) {
            this.g = d.b(iA, getItemCount());
            this.m = d.e(iA, getItemCount());
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerHolder(LayoutInflater.from(this.f).inflate(R.layout.item_share_layout, viewGroup, false));
    }

    public void a(List<ShareDataInfo> list) {
        this.d = list;
    }

    public List<ShareDataInfo> d() {
        return this.d;
    }

    public void b(List<ShareDataInfo> list, int i, boolean z) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("share_EditShareAdapter", "updateList shareDataList is null");
            return;
        }
        ShareDataInfo shareDataInfo = njy.c(list, i) ? list.get(i) : null;
        if (z && this.i == 1 && ((list.size() > this.d.size() + 6 && !qrs.af(this.f)) || (list.size() > this.d.size() + 12 && qrs.af(this.f)))) {
            list.removeAll(this.d);
        }
        this.p.clear();
        this.p.addAll(list);
        if (shareDataInfo != null && z && !njy.e(this.p)) {
            this.p.remove(shareDataInfo);
            this.p.remove(shareDataInfo);
            this.p.add(1, shareDataInfo);
            this.k = this.p.indexOf(shareDataInfo);
        } else {
            this.k = i;
        }
        int iA = d.a(this.n);
        boolean zE = d.e(this.n);
        if (iA > 1 && this.i == 1 && zE) {
            this.g = d.b(iA, getItemCount());
            this.m = d.e(iA, getItemCount());
        }
        notifyDataSetChanged();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerHolder recyclerHolder, int i) {
        ShareRecycleScrollItemView shareRecycleScrollItemView = (ShareRecycleScrollItemView) recyclerHolder.d(R.id.item_single_share);
        int adapterPosition = recyclerHolder.getAdapterPosition();
        if (njy.c(this.p, i) && i != this.f22463c) {
            shareRecycleScrollItemView.setContentViewImage(this.p.get(i));
        }
        ShareDataInfo shareDataInfo = shareRecycleScrollItemView.getShareDataInfo();
        if (shareDataInfo != null && shareDataInfo.getId() != -2) {
            e(shareRecycleScrollItemView, adapterPosition, shareDataInfo);
        }
        if (shareRecycleScrollItemView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) shareRecycleScrollItemView.getLayoutParams();
            layoutParams.height = this.r;
            layoutParams.width = this.r;
            int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(R.dimen.health_common_5dp);
            int dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(R.dimen.emui_card_device_1dp);
            int dimensionPixelSize3 = this.f.getResources().getDimensionPixelSize(R.dimen.emui_card_device_4dp);
            if (!(this.n.getLayoutManager() instanceof GridLayoutManager) || ((GridLayoutManager) this.n.getLayoutManager()).getSpanCount() == 1) {
                dimensionPixelSize = 0;
            }
            layoutParams.setMargins(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize2, 0);
            shareRecycleScrollItemView.setLayoutParams(layoutParams);
        }
        String strA = d.a(i, this.i, this.n, this.m, this.g);
        int i2 = this.k;
        if (i2 == adapterPosition) {
            OnBackgroundChangeListener onBackgroundChangeListener = this.l;
            if (onBackgroundChangeListener != null && i2 != 0) {
                onBackgroundChangeListener.onBackgroundChange(this.i, i2, shareRecycleScrollItemView);
            }
            if (this.k != 0 || this.i != 1) {
                ShareRecycleScrollItemView shareRecycleScrollItemView2 = this.h;
                if (shareRecycleScrollItemView2 != null) {
                    shareRecycleScrollItemView2.setShowSelected(false);
                }
                shareRecycleScrollItemView.setShowSelected(true);
                d.e(shareRecycleScrollItemView, strA, true);
                this.h = shareRecycleScrollItemView;
            } else {
                shareRecycleScrollItemView.setShowSelected(false);
                d.e(shareRecycleScrollItemView, strA, false);
            }
        } else {
            d.e(shareRecycleScrollItemView, strA, false);
            shareRecycleScrollItemView.setShowSelected(false);
        }
        shareRecycleScrollItemView.setDownloading(this.f22462b, shareDataInfo != null && shareDataInfo.getId() == -2);
    }

    private void e(final ShareRecycleScrollItemView shareRecycleScrollItemView, final int i, final ShareDataInfo shareDataInfo) {
        shareRecycleScrollItemView.setOnClickListener(new View.OnClickListener() { // from class: pkg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(shareDataInfo, i, shareRecycleScrollItemView, view);
            }
        });
    }

    public /* synthetic */ void b(ShareDataInfo shareDataInfo, int i, ShareRecycleScrollItemView shareRecycleScrollItemView, View view) {
        if (view instanceof ShareRecycleScrollItemView) {
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", Integer.valueOf(this.i));
            map.put(FunctionSetBeanReader.BI_ELEMENT, Integer.valueOf(shareDataInfo.getId()));
            lmf.d().c(this.f.getApplicationContext(), AnalyticsValue.EDIT_SHARE_TEMPLATE_INDEX_2040104.value(), map, 0);
            ShareRecycleScrollItemView shareRecycleScrollItemView2 = (ShareRecycleScrollItemView) view;
            boolean z = !(i == 0 || EnvironmentInfo.m()) || EnvironmentInfo.m();
            ShareRecycleScrollItemView shareRecycleScrollItemView3 = this.h;
            if (shareRecycleScrollItemView3 != null && z) {
                shareRecycleScrollItemView3.setShowSelected(false);
            }
            if ((shareRecycleScrollItemView2.getShareDataInfo() instanceof plg) && !new File(shareRecycleScrollItemView2.getShareDataInfo().getPath()).exists()) {
                if (((plg) shareRecycleScrollItemView2.getShareDataInfo()).a()) {
                    LogUtil.a("share_EditShareAdapter", "itemView is downloading");
                    return;
                }
                c cVar = new c(shareRecycleScrollItemView2, i, this.f22462b, this.j);
                this.e = cVar;
                b(shareRecycleScrollItemView2, cVar, i);
                return;
            }
            if (z || this.i != 1) {
                e(shareRecycleScrollItemView2, i);
            } else {
                shareRecycleScrollItemView2.setShowSelected(false);
                d.e(shareRecycleScrollItemView, d.a(i, this.i, this.n, this.m, this.g), false);
            }
            this.k = i;
            OnBackgroundChangeListener onBackgroundChangeListener = this.l;
            if (onBackgroundChangeListener != null) {
                onBackgroundChangeListener.onBackgroundChange(this.i, i, shareRecycleScrollItemView);
            }
        }
    }

    private void e(ShareRecycleScrollItemView shareRecycleScrollItemView, int i) {
        ShareRecycleScrollItemView shareRecycleScrollItemView2 = this.h;
        if (shareRecycleScrollItemView2 != null) {
            shareRecycleScrollItemView2.setShowSelected(false);
            d.e(shareRecycleScrollItemView, d.a(i, this.i, this.n, this.m, this.g), false);
        }
        ShareRecycleScrollItemView shareRecycleScrollItemView3 = this.h;
        if (shareRecycleScrollItemView3 != null && shareRecycleScrollItemView3.getShareDataInfo() == shareRecycleScrollItemView.getShareDataInfo() && this.i == 3) {
            this.h = null;
            LogUtil.a("share_EditShareAdapter", "cancel stick");
        } else {
            shareRecycleScrollItemView.setShowSelected(true);
            d.e(shareRecycleScrollItemView, d.a(i, this.i, this.n, this.m, this.g), true);
            this.h = shareRecycleScrollItemView;
            e(i);
        }
    }

    public void e() {
        ShareRecycleScrollItemView shareRecycleScrollItemView = this.h;
        if (shareRecycleScrollItemView != null) {
            shareRecycleScrollItemView.setShowSelected(false);
        }
    }

    private void b(ShareRecycleScrollItemView shareRecycleScrollItemView, DownloadCallback downloadCallback, int i) {
        LogUtil.a("share_EditShareAdapter", "enter changeBackgroundView");
        if (shareRecycleScrollItemView.getShareDataInfo() instanceof plg) {
            plg plgVar = (plg) shareRecycleScrollItemView.getShareDataInfo();
            if (CommonUtil.ab(BaseApplication.b()) && !NetworkUtil.k()) {
                if (this.j != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 3;
                    messageObtain.obj = shareRecycleScrollItemView;
                    this.j.sendMessage(messageObtain);
                    return;
                }
                return;
            }
            if (NetworkUtil.k()) {
                LogUtil.a("share_EditShareAdapter", "changeView :", Integer.valueOf(i));
                shareRecycleScrollItemView.setDownloading(this.f22462b, true);
                ArrayList arrayList = new ArrayList();
                plgVar.a(true);
                arrayList.add(plgVar);
                new pmb().d((List<ShareDataInfo>) arrayList, true, this.f22462b, downloadCallback);
                return;
            }
            qpx.e(this.f, R.string.IDS_connect_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final plg plgVar, final ShareRecycleScrollItemView shareRecycleScrollItemView, final DownloadCallback downloadCallback) {
        String strE = SharedPreferenceManager.e(this.f, Integer.toString(20002), "lastTimeShowDialog");
        if (!TextUtils.isEmpty(strE) && "-1".equals(strE)) {
            shareRecycleScrollItemView.setDownloading(this.f22462b, true);
            ArrayList arrayList = new ArrayList();
            plgVar.a(true);
            arrayList.add(plgVar);
            new pmb().d((List<ShareDataInfo>) arrayList, true, this.f22462b, downloadCallback);
            return;
        }
        View viewInflate = View.inflate(this.f, R.layout.reminder_with_checkbox_dialog, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.reminder_context);
        ((HealthCheckBox) viewInflate.findViewById(R.id.no_more_reminder_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginsocialshare.adapter.EditShareAdapter$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f22464a.e(compoundButton, z);
            }
        });
        textView.setText(b(plgVar.getImageSize()));
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f22462b);
        builder.d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: pkh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: pki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45539b.d(shareRecycleScrollItemView, plgVar, downloadCallback, view);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    /* synthetic */ void e(CompoundButton compoundButton, boolean z) {
        d(String.valueOf(z ? -1L : System.currentTimeMillis()));
    }

    public /* synthetic */ void b(View view) {
        d(String.valueOf(System.currentTimeMillis()));
    }

    public /* synthetic */ void d(ShareRecycleScrollItemView shareRecycleScrollItemView, plg plgVar, DownloadCallback downloadCallback, View view) {
        shareRecycleScrollItemView.setDownloading(this.f22462b, true);
        ArrayList arrayList = new ArrayList();
        plgVar.a(true);
        arrayList.add(plgVar);
        new pmb().d((List<ShareDataInfo>) arrayList, true, this.f22462b, downloadCallback);
        d(String.valueOf(-1));
    }

    private void d(String str) {
        SharedPreferenceManager.e(this.f, Integer.toString(20002), "lastTimeShowDialog", str, new StorageParams());
    }

    private String b(int i) {
        double d2 = ((double) i) / 1048576.0d;
        if (d2 < 0.1d) {
            d2 = 0.1d;
        }
        return String.format(Locale.ENGLISH, this.f.getString(R.string.IDS_watchface_install_prompt), this.f.getString(R.string.IDS_device_upgrade_file_size_mb, UnitUtil.e(d2, 1, 1)));
    }

    public void c() {
        this.f22461a.setId(-2);
        if (this.p.contains(this.f22461a)) {
            return;
        }
        this.p.add(this.f22461a);
        int size = this.p.size() - 1;
        this.f22463c = size;
        notifyItemChanged(size);
    }

    public void b() {
        if (njy.e(this.p)) {
            LogUtil.j("share_EditShareAdapter", "mShareDataInfoList is null");
            return;
        }
        if (this.p.remove(this.f22461a)) {
            int iA = d.a(this.n);
            boolean zE = d.e(this.n);
            if (iA > 1 && this.i == 1 && zE) {
                this.g = d.b(iA, getItemCount());
                this.m = d.e(iA, getItemCount());
            }
            notifyDataSetChanged();
        }
        this.f22463c = -1;
    }

    public EditShareAdapter c(List<ShareDataInfo> list) {
        LogUtil.a("share_EditShareAdapter", "enter enableMoreLoad");
        b();
        int size = this.p.size();
        if (njy.e(list) && this.p.containsAll(this.d)) {
            LogUtil.j("share_EditShareAdapter", "enableMoreLoad no more");
            return this;
        }
        if (njy.e(list)) {
            LogUtil.a("share_EditShareAdapter", "add healthdata");
            this.d.removeAll(this.p);
            this.p.addAll(this.d);
        } else {
            this.p.removeAll(list);
            this.p.addAll(list);
        }
        notifyItemRangeChanged(size, getItemCount() - size);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.p.size();
    }

    public List<ShareDataInfo> a() {
        return this.p;
    }

    public EditShareAdapter a(OnMoreListener onMoreListener) {
        this.o = onMoreListener;
        return this;
    }

    private void e(int i) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.n.getLayoutManager();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition && this.n.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition) != null && (this.n.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition) instanceof RecyclerHolder); iFindFirstVisibleItemPosition++) {
            RecyclerHolder recyclerHolder = (RecyclerHolder) this.n.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if (recyclerHolder != null) {
                ShareRecycleScrollItemView shareRecycleScrollItemView = (ShareRecycleScrollItemView) recyclerHolder.d(R.id.item_single_share);
                if (i != iFindFirstVisibleItemPosition) {
                    d.e(shareRecycleScrollItemView, d.a(iFindFirstVisibleItemPosition, this.i, this.n, this.m, this.g), false);
                }
            }
        }
    }

    static class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static int[][] e(int i, int i2) {
            if (i <= 1 || i2 == 0) {
                return null;
            }
            int i3 = i2 / i;
            if (i2 % i != 0) {
                i3++;
            }
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i3);
            int i4 = 0;
            for (int[] iArr2 : iArr) {
                int i5 = 0;
                while (true) {
                    if (i5 < iArr2.length) {
                        iArr2[i5] = i4;
                        i4++;
                        i5++;
                    }
                }
            }
            return iArr;
        }

        public static int[][] b(int i, int i2) {
            if (i <= 1 || i2 == 0) {
                return null;
            }
            int i3 = i2 / i;
            if (i2 % i != 0) {
                i3++;
            }
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i3);
            int i4 = 0;
            for (int i5 = 0; i5 < iArr[0].length; i5++) {
                for (int[] iArr2 : iArr) {
                    iArr2[i5] = i4;
                    i4++;
                }
            }
            return iArr;
        }

        private static int[] b(int[][] iArr, int i) {
            if (iArr == null || i < 0) {
                return null;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = iArr[i2];
                    if (i3 < iArr2.length) {
                        if (iArr2[i3] == i) {
                            return new int[]{i2, i3};
                        }
                        i3++;
                    }
                }
            }
            return null;
        }

        private static int b(int[] iArr, int[][] iArr2) {
            if (iArr == null || iArr2 == null || iArr.length < 2) {
                return -1;
            }
            int i = iArr[0];
            int i2 = iArr[iArr2.length - 1];
            if (i < 0 || i >= iArr2.length || i2 < 0) {
                return -1;
            }
            int[] iArr3 = iArr2[i];
            if (i2 < iArr3.length) {
                return iArr3[i2];
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(View view, String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (qre.f(R.string.accessibility_select_pic).equals(str)) {
                lrd.a(view, str, (Class<?>) Button.class);
            } else {
                lrd.a(view, qre.a(R.string.accessibility_select_picture, str), z, Button.class);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String a(int i, int i2, HealthRecycleView healthRecycleView, int[][] iArr, int[][] iArr2) {
            if (i2 != 1) {
                return String.valueOf(i + 1);
            }
            if (i == 0) {
                return qre.f(R.string.accessibility_select_pic);
            }
            int iA = a(healthRecycleView);
            boolean zE = e(healthRecycleView);
            if (iA == 1 || !zE) {
                return String.valueOf(i);
            }
            return String.valueOf(b(b(iArr2, i), iArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean e(HealthRecycleView healthRecycleView) {
            return healthRecycleView != null && ((LinearLayoutManager) healthRecycleView.getLayoutManager()).getOrientation() == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(HealthRecycleView healthRecycleView) {
            if (healthRecycleView == null || !(healthRecycleView.getLayoutManager() instanceof GridLayoutManager)) {
                return 1;
            }
            return ((GridLayoutManager) healthRecycleView.getLayoutManager()).getSpanCount();
        }
    }

    static class c implements DownloadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f22466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ShareRecycleScrollItemView f22467b;
        private int d;
        private Handler e;

        c(ShareRecycleScrollItemView shareRecycleScrollItemView, int i, Activity activity, Handler handler) {
            this.f22467b = shareRecycleScrollItemView;
            this.f22466a = new WeakReference<>(activity);
            this.d = i;
            this.e = handler;
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onSuccess(JSONObject jSONObject, ShareDataInfo shareDataInfo) {
            Activity activity = this.f22466a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("share_EditShareAdapter", "WeakDownloadCallback  onSuccess activity is null, finish or destroyed");
                return;
            }
            if (this.e != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = this.f22467b;
                messageObtain.arg1 = this.d;
                this.e.sendMessage(messageObtain);
            }
        }

        @Override // com.huawei.pluginsocialshare.cloud.bean.DownloadCallback
        public void onFailure(int i, String str) {
            Activity activity = this.f22466a.get();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                LogUtil.j("share_EditShareAdapter", "WeakDownloadCallback  onFailure activity is null, finish or destroyed");
            } else if (this.e != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 2;
                this.e.sendMessage(messageObtain);
            }
        }
    }
}

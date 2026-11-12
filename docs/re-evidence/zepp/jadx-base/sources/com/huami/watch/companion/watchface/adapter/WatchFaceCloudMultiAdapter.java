package com.huami.watch.companion.watchface.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.signature.ObjectKey;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.watchface.WatchFaceActivity;
import com.huami.watch.companion.watchface.adapter.WatchFaceCloudMultiAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudMulti;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.util.Analytics;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.xiaomi.hm.health.imageload.GlideApp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceCloudMultiAdapter extends BaseSectionMultiItemQuickAdapter<WatchFaceCloudMulti<WatchFaceCloud>, BaseViewHolder> {
    private static final int n = 50;
    private Context d;
    private Device e;
    private int f;
    private String g;
    private boolean h;
    private Map<Integer, WatchFaceCloudMulti<WatchFaceCloud>> i;
    private boolean j;
    private TextView k;
    private int l;
    private boolean m;

    public class a implements ProgressWheel.ProgressCallback {
        public final /* synthetic */ ProgressWheel a;

        public a(ProgressWheel progressWheel) {
            this.a = progressWheel;
        }

        @Override // com.pnikosis.materialishprogress.ProgressWheel.ProgressCallback
        public void onProgressUpdate(float f) {
            if (f == 0.0f) {
                this.a.setProgress(1.0f);
            }
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ WatchFaceCloudMulti a;
        public final /* synthetic */ WatchFaceCloud b;

        public b(WatchFaceCloudMulti watchFaceCloudMulti, WatchFaceCloud watchFaceCloud) {
            this.a = watchFaceCloudMulti;
            this.b = watchFaceCloud;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WatchFaceCloudMulti watchFaceCloudMulti = this.a;
            watchFaceCloudMulti.setChecked(!watchFaceCloudMulti.isChecked());
            int watchFaceId = this.b.getWatchFaceId();
            if (this.a.isChecked()) {
                WatchFaceCloudMultiAdapter.this.i.put(Integer.valueOf(watchFaceId), this.a);
                WatchFaceCloudMultiAdapter.this.h();
                return;
            }
            if (WatchFaceCloudMultiAdapter.this.j) {
                WatchFaceCloudMultiAdapter watchFaceCloudMultiAdapter = WatchFaceCloudMultiAdapter.this;
                watchFaceCloudMultiAdapter.updateRightText(!watchFaceCloudMultiAdapter.j);
            }
            if (WatchFaceCloudMultiAdapter.this.i.containsKey(Integer.valueOf(watchFaceId))) {
                WatchFaceCloudMultiAdapter.this.i.remove(Integer.valueOf(watchFaceId));
            }
        }
    }

    public WatchFaceCloudMultiAdapter(Context context, List<WatchFaceCloudMulti<WatchFaceCloud>> list, String str) {
        super(list);
        this.d = context;
        addHeaderItemType(BaseSectionMultiItemQuickAdapter.HEAD_LEFT, R.layout.item_watchface_header);
        addHeaderItemType(BaseSectionMultiItemQuickAdapter.HEAD_TOP_BOTTOM, R.layout.item_watchface_header_top_bottom);
        addItemType(3, R.layout.list_item_watchface_all);
        this.g = str;
        this.i = new HashMap();
        this.f = WatchFaceHelper.getLocalSelectWatchFaceId(this.g);
        this.e = DeviceManager.getManager(this.d).getCurrentDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int size = this.i.size();
        if (size == getRealCount()) {
            this.j = true;
            updateRightText(true);
        }
        this.m = size >= 50;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(ProgressWheel progressWheel) {
        if (progressWheel == null || !progressWheel.isSpinning()) {
            return;
        }
        Log.d("WatchFaceAdapter", "spin time out, remove spinning state");
        progressWheel.stopSpinning();
        progressWheel.setInstantProgress(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(WatchFaceCloud watchFaceCloud, ProgressWheel progressWheel, Runnable runnable, View view) {
        if (ismEditMode()) {
            return;
        }
        Device device = this.e;
        if (device == null) {
            Toast.makeText(this.d, R.string.set_watch_face_unbound, 0).show();
            return;
        }
        if (!device.isConnected()) {
            Toast.makeText(this.d, R.string.set_watch_face_disconnected, 0).show();
        } else if (this.f != watchFaceCloud.getWatchFaceId()) {
            WatchFaceHelper.setSelectWatchFaceToRom(this.d, this.g, watchFaceCloud.getWatchFaceId());
            if (progressWheel != null) {
                progressWheel.spin();
                progressWheel.postDelayed(runnable, 5000L);
            }
        }
        analyticsEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        allSelect(!this.j);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    private void l(ImageView imageView, Object obj, int i) {
        Context context = this.d;
        (context instanceof Activity ? GlideApp.with((Activity) context) : GlideApp.with(context)).load(obj).signature(new ObjectKey(Integer.valueOf(i))).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(imageView);
    }

    public void allSelect(boolean z) {
        this.i.clear();
        this.j = z;
        if (z) {
            for (T t : this.mData) {
                if (!t.isHeader && t.getT() != null) {
                    t.setChecked(true);
                    this.i.put(Integer.valueOf(t.getT().getWatchFaceId()), t);
                }
            }
        } else {
            for (T t2 : this.mData) {
                if (!t2.isHeader && t2.getT() != 0) {
                    t2.setChecked(false);
                }
            }
        }
        notifyDataSetChanged();
        if (this.j) {
            h();
        }
    }

    public void analyticsEvent() {
        Context context = this.d;
        if (context instanceof WatchFaceActivity) {
            Analytics.event(context, "WatchFace", 1);
        } else {
            Analytics.event(context, AnalyticsEvents.EVENT_MAIN_PAGE_WATCH_FACE_CLICKED, 1);
        }
    }

    public int getRealCount() {
        return this.l;
    }

    public Map<Integer, WatchFaceCloudMulti<WatchFaceCloud>> getmCheckedMap() {
        return this.i;
    }

    public boolean isOutOfSize() {
        return this.m;
    }

    public boolean ismEditMode() {
        return this.h;
    }

    public void notifySelectWF(boolean z) {
        this.f = WatchFaceHelper.getLocalSelectWatchFaceId(this.g);
        if (z) {
            notifyDataSetChanged();
        }
    }

    public void setEditModel(boolean z, boolean z2) {
        this.h = z;
        this.j = false;
        if (!z2) {
            this.i.clear();
            return;
        }
        Iterator<WatchFaceCloudMulti<WatchFaceCloud>> it2 = this.i.values().iterator();
        while (it2.hasNext()) {
            it2.next().setChecked(false);
        }
        this.i.clear();
        notifyDataSetChanged();
    }

    public void setRealCount(int i) {
        this.l = i;
    }

    public void updateRightText(boolean z) {
        TextView textView = this.k;
        if (textView != null) {
            if (z) {
                textView.setText("取消全选");
            } else {
                textView.setText("全选");
            }
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, WatchFaceCloudMulti<WatchFaceCloud> watchFaceCloudMulti) {
        int i;
        final WatchFaceCloud t = watchFaceCloudMulti.getT();
        if (t != null) {
            View view = baseViewHolder.getView(R.id.watchface_preview);
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.watchface_preview_image);
            TextView textView = (TextView) baseViewHolder.getView(R.id.watchface_title);
            textView.setText(t.getName());
            if (TextUtils.isEmpty(t.getImage())) {
                l(imageView, Integer.valueOf(t.getLocalImage()), t.getWatchFaceId());
            } else {
                l(imageView, t.getImage(), t.getWatchFaceId());
            }
            imageView.setAlpha(1.0f);
            view.setSelected(false);
            textView.setSelected(false);
            final ProgressWheel progressWheel = (ProgressWheel) baseViewHolder.getView(R.id.progress_wheel);
            final Runnable runnable = new Runnable() { // from class: se8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchFaceCloudMultiAdapter.i(progressWheel);
                }
            };
            if (progressWheel != null && !progressWheel.isSpinning()) {
                progressWheel.setInstantProgress(0.0f);
                progressWheel.removeCallbacks(runnable);
            }
            boolean z = true;
            if (this.e == null || (i = this.f) == -1 || i != t.getWatchFaceId()) {
                z = false;
            } else {
                if (progressWheel == null || !progressWheel.isSpinning()) {
                    view.setSelected(true);
                } else {
                    progressWheel.stopSpinning();
                    progressWheel.setCallback(new a(progressWheel));
                }
                textView.setSelected(true);
            }
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: re8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.j(t, progressWheel, runnable, view2);
                }
            });
            CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.checkbox);
            if (!ismEditMode()) {
                checkBox.setVisibility(8);
                return;
            }
            checkBox.setChecked(watchFaceCloudMulti.isChecked());
            if (z) {
                checkBox.setVisibility(8);
                imageView.setAlpha(0.3f);
            } else {
                checkBox.setVisibility(0);
                checkBox.setOnClickListener(new b(watchFaceCloudMulti, t));
            }
        }
    }

    @Override // com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter
    public void convertHead(BaseViewHolder baseViewHolder, WatchFaceCloudMulti<WatchFaceCloud> watchFaceCloudMulti) {
        baseViewHolder.setText(R.id.tv_title, watchFaceCloudMulti.getHeader());
        int i = R.id.tv_right;
        baseViewHolder.setVisible(i, this.h && watchFaceCloudMulti.isRight());
        if (watchFaceCloudMulti.isRight()) {
            this.k = (TextView) baseViewHolder.getView(i);
            updateRightText(this.j);
        }
        if (watchFaceCloudMulti.getItemType() == 1090) {
            baseViewHolder.setText(R.id.tv_bottom, watchFaceCloudMulti.getBottom());
        }
        baseViewHolder.setOnClickListener(i, new View.OnClickListener() { // from class: qe8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
    }
}

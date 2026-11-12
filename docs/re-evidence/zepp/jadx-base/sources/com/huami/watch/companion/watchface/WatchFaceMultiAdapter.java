package com.huami.watch.companion.watchface;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.signature.ObjectKey;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.watchface.WatchFaceMultiAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceMulti;
import com.huami.watch.util.Analytics;
import com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter;
import com.pnikosis.materialishprogress.ProgressWheel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceMultiAdapter extends BaseSectionMultiItemQuickAdapter<WatchFaceMulti, BaseViewHolder> {
    private static final int o = 50;
    private Context d;
    private Device e;
    private WatchFace f;
    private String g;
    private boolean h;
    private Map<Long, WatchFaceMulti> i;
    private boolean j;
    private TextView k;
    private int l;
    private boolean m;
    private boolean n;

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
        public final /* synthetic */ WatchFaceMulti a;
        public final /* synthetic */ WatchFace b;

        public b(WatchFaceMulti watchFaceMulti, WatchFace watchFace) {
            this.a = watchFaceMulti;
            this.b = watchFace;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WatchFaceMulti watchFaceMulti = this.a;
            watchFaceMulti.setChecked(!watchFaceMulti.isChecked());
            Long id = this.b.getId();
            if (this.a.isChecked()) {
                WatchFaceMultiAdapter.this.i.put(id, this.a);
                WatchFaceMultiAdapter.this.h();
                return;
            }
            if (WatchFaceMultiAdapter.this.j) {
                WatchFaceMultiAdapter watchFaceMultiAdapter = WatchFaceMultiAdapter.this;
                watchFaceMultiAdapter.updateRightText(!watchFaceMultiAdapter.j);
            }
            if (WatchFaceMultiAdapter.this.i.containsKey(id)) {
                WatchFaceMultiAdapter.this.i.remove(id);
            }
        }
    }

    public WatchFaceMultiAdapter(Context context, List<WatchFaceMulti> list, String str) {
        super(list);
        this.d = context;
        addHeaderItemType(BaseSectionMultiItemQuickAdapter.HEAD_LEFT, R.layout.item_watchface_header);
        addHeaderItemType(BaseSectionMultiItemQuickAdapter.HEAD_TOP_BOTTOM, R.layout.item_watchface_header_top_bottom);
        addItemType(3, R.layout.list_item_watchface_all);
        this.g = str;
        this.i = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int size = this.i.size();
        if (size == getRealCount()) {
            this.j = true;
            updateRightText(true);
        }
        this.n = size >= 50;
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
    public /* synthetic */ void j(WatchFace watchFace, ProgressWheel progressWheel, Runnable runnable, View view) {
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
        } else if (!WatchFaceManager.isEqualsWatchFace(this.f, watchFace) && isComplete()) {
            SyncUtil.syncWatchFaceToWatch(this.d, watchFace.packageName, watchFace.serviceName);
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

    private void l(ImageView imageView, byte[] bArr, String str) {
        Glide.with(this.d).load(bArr).apply(new RequestOptions().placeholder(R.drawable.watch_face_list_default).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(false).signature(new ObjectKey(str)).optionalCircleCrop()).into(imageView);
    }

    public void allSelect(boolean z) {
        this.i.clear();
        this.j = z;
        if (z) {
            for (T t : this.mData) {
                if (!t.isHeader && t.getT() != null) {
                    t.setChecked(true);
                    this.i.put(t.getT().getId(), t);
                }
            }
        } else {
            for (T t2 : this.mData) {
                if (!t2.isHeader && t2.getT() != null) {
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

    public Map<Long, WatchFaceMulti> getmCheckedMap() {
        return this.i;
    }

    public boolean isComplete() {
        return this.m;
    }

    public boolean isOutOfSize() {
        return this.n;
    }

    public boolean ismEditMode() {
        return this.h;
    }

    public void notifySelectWF(boolean z) {
        this.f = WatchFaceManager.getManager().getSelectedWatchFace(this.d, false, this.g);
        this.e = DeviceManager.getManager(this.d).getCurrentDevice();
        if (z) {
            notifyDataSetChanged();
        }
    }

    public void setComplete(boolean z) {
        this.m = z;
    }

    public void setEditModel(boolean z) {
        this.h = z;
        this.j = false;
        Iterator<WatchFaceMulti> it2 = this.i.values().iterator();
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
    public void convert(BaseViewHolder baseViewHolder, WatchFaceMulti watchFaceMulti) {
        WatchFace watchFace;
        final WatchFace t = watchFaceMulti.getT();
        if (t != null) {
            View view = baseViewHolder.getView(R.id.watchface_preview);
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.watchface_preview_image);
            TextView textView = (TextView) baseViewHolder.getView(R.id.watchface_title);
            textView.setText(t.label);
            l(imageView, t.previewThumb, t.serviceName);
            view.setSelected(false);
            textView.setSelected(false);
            final ProgressWheel progressWheel = (ProgressWheel) baseViewHolder.getView(R.id.progress_wheel);
            final Runnable runnable = new Runnable() { // from class: cg8
                @Override // java.lang.Runnable
                public final void run() {
                    WatchFaceMultiAdapter.i(progressWheel);
                }
            };
            if (progressWheel != null && !progressWheel.isSpinning()) {
                progressWheel.setInstantProgress(0.0f);
                progressWheel.removeCallbacks(runnable);
            }
            if (this.e != null && (watchFace = this.f) != null && WatchFaceManager.isEqualsWatchFace(watchFace, t)) {
                if (progressWheel == null || !progressWheel.isSpinning()) {
                    view.setSelected(true);
                } else {
                    progressWheel.stopSpinning();
                    progressWheel.setCallback(new a(progressWheel));
                }
                textView.setSelected(true);
            }
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: bg8
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
            checkBox.setChecked(watchFaceMulti.isChecked());
            checkBox.setVisibility(0);
            checkBox.setOnClickListener(new b(watchFaceMulti, t));
        }
    }

    @Override // com.huami.widget.baseadapter.BaseSectionMultiItemQuickAdapter
    public void convertHead(BaseViewHolder baseViewHolder, WatchFaceMulti watchFaceMulti) {
        baseViewHolder.setText(R.id.tv_title, watchFaceMulti.getHeader());
        int i = R.id.tv_right;
        baseViewHolder.setVisible(i, this.h && watchFaceMulti.isRight());
        if (watchFaceMulti.isRight()) {
            this.k = (TextView) baseViewHolder.getView(i);
            updateRightText(this.j);
        }
        if (watchFaceMulti.getItemType() == 1090) {
            baseViewHolder.setText(R.id.tv_bottom, watchFaceMulti.getBottom());
        }
        baseViewHolder.setOnClickListener(i, new View.OnClickListener() { // from class: ag8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
    }
}

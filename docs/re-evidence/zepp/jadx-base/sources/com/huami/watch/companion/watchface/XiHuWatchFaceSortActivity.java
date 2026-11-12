package com.huami.watch.companion.watchface;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.huami.wallet.ui.decoration.DividerDecoration;
import com.huami.wallet.ui.utils.ListUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.app.ItemDragCallback;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.watchface.adapter.WatchFaceSortAdapter;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class XiHuWatchFaceSortActivity extends BaseWatchFaceActivity {
    private static final String f = "XiHuWatchFaceSortActivity";
    private RecyclerView b;
    private List<WatchFaceBean> c;
    private WatchFaceSortAdapter d;
    private OnItemDragListener e = new b();

    public class a extends ItemDragCallback {
        public a(BaseItemDraggableAdapter baseItemDraggableAdapter) {
            super(baseItemDraggableAdapter);
        }

        @Override // com.huami.watch.companion.app.ItemDragCallback, com.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        /* JADX INFO: renamed from: isLongPressDragEnabled */
        public boolean getIsEnableDrag() {
            return true;
        }
    }

    public class b implements OnItemDragListener {
        private int a;

        public b() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int i) {
            viewHolder.itemView.setBackgroundResource(0);
            XiHuWatchFaceSortActivity.this.z(this.a, i);
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2) {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int i) {
            this.a = i;
            View view = viewHolder.itemView;
            view.setBackgroundResource(R.drawable.list_drag_bg);
            view.getBackground().setLevel(10000);
        }
    }

    private void A() {
        a aVar = new a(this.d);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(aVar);
        aVar.setDragMoveFlags(3);
        itemTouchHelper.attachToRecyclerView(this.b);
        this.d.enableDragItem(itemTouchHelper);
        this.d.setOnItemDragListener(this.e);
    }

    private void B() {
        this.b.setLayoutManager(new LinearLayoutManager(this));
        this.b.addItemDecoration(new DividerDecoration(ListUtils.getMiddleDividerStyle(this)));
        WatchFaceSortAdapter watchFaceSortAdapter = new WatchFaceSortAdapter(this.c);
        this.d = watchFaceSortAdapter;
        this.b.setAdapter(watchFaceSortAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(int i, int i2, ObservableEmitter observableEmitter) throws Exception {
        notifyIndex(i, i2);
        observableEmitter.onNext(buildJsonStr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(DataTransportResult dataTransportResult) {
        dismissDialog(this.mLoadDialog);
        if (dataTransportResult != null && dataTransportResult.getResultCode() == 0) {
            this.b.post(new Runnable() { // from class: yy8
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.D();
                }
            });
            syncAllWatchFace(false);
            Toast.makeText(this, R.string.xihu_watch_face_sort_success, 0).show();
        } else {
            Log.d(f, "WatchFaceSort:" + dataTransportResult, new Object[0]);
            Toast.makeText(this, R.string.xihu_watch_face_sort_failed, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(final DataTransportResult dataTransportResult) {
        Rx.mainThread(new Runnable() { // from class: zy8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E(dataTransportResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        syncDataToWatch(WatchFaceModule.ACTION_WATCHFACE_SORT, str, new Transporter.DataSendResultCallback() { // from class: vy8
            @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
            public final void onResultBack(DataTransportResult dataTransportResult) {
                this.a.F(dataTransportResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(final int i, final int i2) {
        if (i == i2) {
            return;
        }
        showLoadDialog(getString(R.string.xihu_watch_face_sort_ing), "sortDialog");
        Rx.io(new ObservableOnSubscribe() { // from class: wy8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.C(i, i2, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: xy8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.G((String) obj);
            }
        });
    }

    public String buildJsonStr() {
        JSONArray jSONArray = new JSONArray();
        for (WatchFaceBean watchFaceBean : this.c) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", watchFaceBean.getId());
                jSONObject.put("index", watchFaceBean.getIndex());
                jSONObject.put("dialName", watchFaceBean.getDialName());
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Log.d(f, "watchFace: sort: buildJsonStr: " + jSONArray.toString(), new Object[0]);
        return jSONArray.toString();
    }

    public void notifyIndex(int i, int i2) {
        WatchFaceBean item = this.d.getItem(i);
        int index = this.d.getItem(i2).getIndex();
        if (i < i2) {
            while (i2 > i) {
                this.c.get(i2).setIndex(this.c.get(i2 - 1).getIndex());
                i2--;
            }
        } else {
            while (i2 < i) {
                WatchFaceBean watchFaceBean = this.c.get(i2);
                i2++;
                watchFaceBean.setIndex(this.c.get(i2).getIndex());
            }
        }
        item.setIndex(index);
    }

    @Override // com.huami.watch.companion.watchface.BaseWatchFaceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_xi_hu_watch_face_sort);
        List<WatchFaceBean> list = (List) getIntent().getExtras().getSerializable("datas");
        this.c = list;
        if (list == null || list.size() == 0) {
            Toast.makeText(this, R.string.wl_no_data, 0).show();
            return;
        }
        this.b = (RecyclerView) findViewById(R.id.recycle_view);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.action_bar);
        actionbarLayout.setTitleText(getString(R.string.xihu_watch_face_list));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: uy8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        B();
        A();
    }

    @Override // com.huami.watch.companion.watchface.BaseWatchFaceActivity
    public void r(TransportDataItem transportDataItem) {
    }
}

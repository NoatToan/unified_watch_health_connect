package com.xiaomi.hm.health.device.watch_skin;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.watch_skin.LocalWatchSkinFragment;
import com.xiaomi.hm.health.fragment.BaseFragment;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class LocalWatchSkinFragment extends BaseFragment {
    public static final int TYPE_CHAOHU = 0;
    public static final int TYPE_TEMPO = 1;
    private static final String h = "LocalWatchSkinFragment";
    private static final String i = "file_path";
    private static final int j = 2;
    private static final int k = 3;
    private static final float l = 20.0f;
    private static final float m = 22.5f;
    private int a = 0;
    private RecyclerView b;
    private TextView c;
    private TextView d;
    private com.xiaomi.hm.health.device.watch_skin.a e;
    private int f;
    private String g;

    public class a extends RecyclerView.ItemDecoration {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            rect.set(LocalWatchSkinFragment.this.f / 2, LocalWatchSkinFragment.this.f / 2, LocalWatchSkinFragment.this.f / 2, LocalWatchSkinFragment.this.f / 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.b.setLayoutManager(new GridLayoutManager(getContext(), this.a == 0 ? 2 : 3));
        RecyclerView recyclerView = this.b;
        int i2 = this.f;
        recyclerView.setPadding(i2 / 2, i2 / 2, i2 / 2, i2 / 2);
        this.b.setAdapter(this.e);
        this.b.addItemDecoration(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        this.c.setVisibility(8);
        this.d.setVisibility(0);
        this.e.doAnim(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.c.setVisibility(0);
        if (this.e.isEmpty()) {
            this.c.setEnabled(false);
        }
        this.d.setVisibility(8);
        this.e.doAnim(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List k(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            WatchSkinManager.j((AppCompatActivity) getActivity(), str);
        }
        return WatchSkinManager.traverseAllWatchSkin(getContext(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(List list) {
        if (list == null || list.size() == 0) {
            this.c.setEnabled(false);
        } else {
            this.c.setEnabled(true);
            this.e.setData(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Throwable th) {
        HMLog.i(h, "traverse WatchSkin error: " + th, new Object[0]);
    }

    public static LocalWatchSkinFragment newInstance(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("file_path", str);
        LocalWatchSkinFragment localWatchSkinFragment = new LocalWatchSkinFragment();
        localWatchSkinFragment.setArguments(bundle);
        return localWatchSkinFragment;
    }

    public void n(final String str) {
        Observable.fromCallable(new Callable() { // from class: br4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.k(str);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: cr4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.l((List) obj);
            }
        }, new Action1() { // from class: dr4
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                LocalWatchSkinFragment.m((Throwable) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        int i2 = WatchSkinManager.f() == HMDeviceSource.MILI_PEYTO ? 0 : 1;
        this.a = i2;
        this.f = (int) ViewUtils.dp2px(context, i2 == 0 ? 20.0f : m);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.g = arguments.getString("file_path");
        }
        HMLog.d(h, "path: " + this.g, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_local_watch_skin, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(WatchSkinDownloadEvent watchSkinDownloadEvent) {
        if (watchSkinDownloadEvent.success) {
            n(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        this.b = (RecyclerView) view.findViewById(R.id.watch_skin_list);
        this.e = new com.xiaomi.hm.health.device.watch_skin.a((AppCompatActivity) getActivity(), this.b, this.a, this.f);
        this.b.post(new Runnable() { // from class: ar4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
        this.c = (TextView) view.findViewById(R.id.edit_btn);
        this.d = (TextView) view.findViewById(R.id.done_btn);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: zq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.i(view2);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: yq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.j(view2);
            }
        });
        n(this.g);
        EventBus.getDefault().registerSticky(this);
    }
}

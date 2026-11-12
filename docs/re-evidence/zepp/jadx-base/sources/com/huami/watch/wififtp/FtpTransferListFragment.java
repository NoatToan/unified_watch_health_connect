package com.huami.watch.wififtp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.FtpTransferListFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class FtpTransferListFragment extends Fragment {
    private static final int l = 0;
    private static final int m = 1;
    private View c;
    private PhoneWifiFtpUtil d;
    private PhoneWifiFtpUtil.FTPCallback e;
    private ListView g;
    private e h;
    private View i;
    private boolean a = true;
    private String b = FtpTransferListFragment.class.getSimpleName();
    private ArrayList<PhoneWifiFtpUtil.TransferTask> f = new ArrayList<>();
    private c j = new c(this, null);
    private View.OnClickListener k = new b();

    public class a implements PhoneWifiFtpUtil.FTPCallback {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(PhoneWifiFtpUtil.TransferTask transferTask) {
            return "onTaskAdd: " + transferTask;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(PhoneWifiFtpUtil.TransferTask transferTask) {
            return "onTaskStateChanged: " + transferTask;
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onConnected() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onDisconnected() {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDelete(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileDownload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUpload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onFileUploadProgress(PhoneWifiFtpUtil.TransferTask transferTask, int i) {
            if (transferTask == null || !PhoneWifiFtpUtil.isSupportFileType(transferTask.getLocalName())) {
                return;
            }
            FtpTransferListFragment.this.v(transferTask.getID());
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onNeedRetryTask(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskAdd(final PhoneWifiFtpUtil.TransferTask transferTask) {
            HMLog.debug(FtpTransferListFragment.this.b, new Function0() { // from class: com.huami.watch.wififtp.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.a.c(transferTask);
                }
            });
            if (PhoneWifiFtpUtil.isSupportFileType(transferTask.getLocalName()) && !FtpTransferListFragment.this.f.contains(transferTask)) {
                FtpTransferListFragment ftpTransferListFragment = FtpTransferListFragment.this;
                FtpTransferListFragment.this.f.add(ftpTransferListFragment.getInsertIndex(ftpTransferListFragment.f, transferTask), transferTask);
                FtpTransferListFragment.this.h.notifyDataSetChanged();
                if (FtpTransferListFragment.this.i.getVisibility() != 8) {
                    FtpTransferListFragment.this.i.setVisibility(8);
                }
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskRemove(PhoneWifiFtpUtil.TransferTask transferTask) {
            if (PhoneWifiFtpUtil.isSupportFileType(transferTask.getLocalName())) {
                FtpTransferListFragment.this.f.remove(transferTask);
                FtpTransferListFragment.this.h.notifyDataSetChanged();
                if (!FtpTransferListFragment.this.f.isEmpty() || FtpTransferListFragment.this.i.getVisibility() == 0) {
                    return;
                }
                FtpTransferListFragment.this.i.setAlpha(0.0f);
                FtpTransferListFragment.this.i.setVisibility(0);
                FtpTransferListFragment.this.i.animate().alpha(1.0f).setDuration(150L).setStartDelay(500L).start();
            }
        }

        @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
        public void onTaskStateChanged(final PhoneWifiFtpUtil.TransferTask transferTask) {
            HMLog.debug(FtpTransferListFragment.this.b, new Function0() { // from class: com.huami.watch.wififtp.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.a.d(transferTask);
                }
            });
            if (PhoneWifiFtpUtil.isSupportFileType(transferTask.getLocalName())) {
                int state = transferTask.getState();
                if (state != 0) {
                    if (state != 2) {
                        if (state != 3) {
                            if (state != 4) {
                                return;
                            }
                        }
                    }
                    FtpTransferListFragment.this.f.remove(transferTask);
                    FtpTransferListFragment.this.h.notifyDataSetChanged();
                    if (!FtpTransferListFragment.this.f.isEmpty() || FtpTransferListFragment.this.i.getVisibility() == 0) {
                        return;
                    }
                    FtpTransferListFragment.this.i.setAlpha(0.0f);
                    FtpTransferListFragment.this.i.setVisibility(0);
                    FtpTransferListFragment.this.i.animate().alpha(1.0f).setDuration(150L).setStartDelay(500L).start();
                    return;
                }
                FtpTransferListFragment ftpTransferListFragment = FtpTransferListFragment.this;
                ftpTransferListFragment.w(ftpTransferListFragment.f);
                FtpTransferListFragment.this.h.notifyDataSetChanged();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FtpTransferListFragment.this.onRetryAllBtnClick();
        }
    }

    public final class c implements Comparator<PhoneWifiFtpUtil.TransferTask> {
        public int a;
        public int b;

        private c() {
        }

        private int b(int i) {
            if (i != 1) {
                return i != 3 ? 1 : 2;
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(PhoneWifiFtpUtil.TransferTask transferTask, PhoneWifiFtpUtil.TransferTask transferTask2) {
            this.a = b(transferTask.getState());
            int iB = b(transferTask2.getState());
            this.b = iB;
            int i = this.a;
            return i != iB ? i - iB : transferTask.getID() - transferTask2.getID();
        }

        public /* synthetic */ c(FtpTransferListFragment ftpTransferListFragment, a aVar) {
            this();
        }
    }

    public static class d {
        public View a;
        public TextView b;
        public View c;
        public View d;
        public TextView e;
        public ProgressBar f;
        public View g;
        public View h;

        private d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public class e extends BaseAdapter {
        private static final String e = ".mp3";
        private static final String f = ".wav";
        private static final String g = ".gpx";
        private LayoutInflater a;
        private int b;
        private int c;

        public class a implements View.OnClickListener {
            public final /* synthetic */ PhoneWifiFtpUtil.TransferTask a;

            public a(PhoneWifiFtpUtil.TransferTask transferTask) {
                this.a = transferTask;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FtpTransferListFragment.this.u(this.a);
            }
        }

        public class b implements View.OnClickListener {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FtpTransferListFragment.this.t(this.a);
            }
        }

        public e(Context context, LayoutInflater layoutInflater, int i) {
            this.a = layoutInflater;
            this.b = i;
            this.c = (int) (context.getResources().getDisplayMetrics().density * 10.0f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return FtpTransferListFragment.this.f.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return FtpTransferListFragment.this.f.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return FtpTransferListFragment.this.x(((PhoneWifiFtpUtil.TransferTask) getItem(i)).getState());
        }

        @Override // android.widget.Adapter
        @NonNull
        public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
            d dVar;
            FtpTransferListFragment.this.getActivity();
            if (view == null) {
                view = this.a.inflate(this.b, viewGroup, false);
                dVar = new d(null);
                dVar.a = view.findViewById(R.id.task_item_head);
                dVar.b = (TextView) view.findViewById(R.id.task_item_head_title);
                dVar.c = view.findViewById(R.id.task_item_head_retry_btn);
                dVar.d = view.findViewById(R.id.task_item_img);
                dVar.e = (TextView) view.findViewById(R.id.task_item_text);
                dVar.f = (ProgressBar) view.findViewById(R.id.task_item_progress);
                dVar.g = view.findViewById(R.id.task_item_retry_btn);
                dVar.h = view.findViewById(R.id.task_item_remove_btn);
                view.setTag(dVar);
            } else {
                dVar = (d) view.getTag();
            }
            if (getCount() > i) {
                PhoneWifiFtpUtil.TransferTask transferTask = (PhoneWifiFtpUtil.TransferTask) getItem(i);
                int iX = FtpTransferListFragment.this.x(transferTask.getState());
                if (i == 0 || getItemViewType(i - 1) != iX) {
                    if (dVar.a.getVisibility() != 0) {
                        dVar.a.setVisibility(0);
                    }
                    if (iX == 0) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.a.getLayoutParams();
                        layoutParams.topMargin = 0;
                        dVar.a.setLayoutParams(layoutParams);
                        dVar.b.setText(R.string.file_manager_transferring);
                        if (dVar.c.getVisibility() != 8) {
                            dVar.c.setVisibility(8);
                        }
                    } else if (iX == 1) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) dVar.a.getLayoutParams();
                        layoutParams2.topMargin = i > 0 ? this.c : 0;
                        dVar.a.setLayoutParams(layoutParams2);
                        dVar.b.setText(R.string.file_manager_transfer_failed);
                        if (dVar.c.getVisibility() != 0) {
                            dVar.c.setVisibility(0);
                        }
                        dVar.c.setOnClickListener(FtpTransferListFragment.this.k);
                    }
                } else if (dVar.a.getVisibility() != 8) {
                    dVar.a.setVisibility(8);
                }
                if (transferTask.getLocalName().endsWith(".mp3") || transferTask.getLocalName().endsWith(f)) {
                    dVar.d.setBackgroundResource(R.drawable.ftp_icon_music);
                } else if (transferTask.getLocalName().endsWith(".gpx")) {
                    dVar.d.setBackgroundResource(R.drawable.ftp_icon_gpx);
                }
                dVar.e.setText(transferTask.getLocalName());
                dVar.f.setProgress(transferTask.getProgress());
                int id = transferTask.getID();
                if (iX != 0) {
                    if (iX == 1) {
                        if (dVar.g.getVisibility() != 0) {
                            dVar.g.setVisibility(0);
                        }
                        dVar.g.setOnClickListener(new a(transferTask));
                    }
                } else if (dVar.g.getVisibility() != 8) {
                    dVar.g.setVisibility(8);
                }
                dVar.h.setOnClickListener(new b(id));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }
    }

    private void o() {
        a aVar = new a();
        this.e = aVar;
        this.d.registerFTPCallback(aVar);
        ArrayList<PhoneWifiFtpUtil.TransferTask> transferTaskList = this.d.getTransferTaskList();
        PhoneWifiFtpUtil.cleanUnSupportFileType(transferTaskList);
        if (transferTaskList == null || transferTaskList.size() <= 0) {
            this.f.clear();
        } else {
            w(transferTaskList);
            this.f = transferTaskList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "onHeaderRemoveBtnClick";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(int i) {
        return "onItemRemoveBtnClick " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(PhoneWifiFtpUtil.TransferTask transferTask) {
        return "onItemRetryBtnClick " + transferTask.getID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "onRetryAllBtnClick";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(final int i) {
        if (this.a) {
            HMLog.debug(this.b, new Function0() { // from class: yb2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.q(i);
                }
            });
        }
        this.d.removeTransferTask(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(final PhoneWifiFtpUtil.TransferTask transferTask) {
        if (this.a) {
            HMLog.debug(this.b, new Function0() { // from class: zb2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.r(transferTask);
                }
            });
        }
        this.d.retryTransferTask(transferTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i) {
        ListView listView = this.g;
        if (listView != null) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int lastVisiblePosition = this.g.getLastVisiblePosition();
            for (int i2 = firstVisiblePosition; i2 <= lastVisiblePosition; i2++) {
                if (i == ((PhoneWifiFtpUtil.TransferTask) this.g.getItemAtPosition(i2)).getID()) {
                    this.h.getView(i2, this.g.getChildAt(i2 - firstVisiblePosition), this.g);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(List<PhoneWifiFtpUtil.TransferTask> list) {
        if (list != null) {
            Collections.sort(list, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x(int i) {
        return i != 3 ? 0 : 1;
    }

    public int getInsertIndex(List<PhoneWifiFtpUtil.TransferTask> list, PhoneWifiFtpUtil.TransferTask transferTask) {
        int iBinarySearch = Collections.binarySearch(list, transferTask, this.j);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater.inflate(R.layout.fragment_ftp_transfer_list, viewGroup, false);
        this.d = PhoneWifiFtpUtil.get();
        o();
        this.i = this.c.findViewById(R.id.attention);
        if (this.d.getTaskCount() > 0) {
            this.i.setVisibility(8);
        }
        this.g = (ListView) this.c.findViewById(R.id.file_manager_transfer_list);
        e eVar = new e(getActivity(), layoutInflater, R.layout.list_item_ftp_transfer_task);
        this.h = eVar;
        this.g.setAdapter((ListAdapter) eVar);
        return this.c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.d.unregisterFTPCallback(this.e);
        super.onDestroyView();
    }

    public void onHeaderRemoveBtnClick() {
        if (this.a) {
            HMLog.debug(this.b, new Function0() { // from class: ac2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.p();
                }
            });
        }
        for (int size = this.f.size() - 1; size >= 0; size--) {
            this.d.removeTransferTask(this.f.get(size).getID());
        }
    }

    public void onRetryAllBtnClick() {
        if (this.a) {
            HMLog.debug(this.b, new Function0() { // from class: bc2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FtpTransferListFragment.s();
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<PhoneWifiFtpUtil.TransferTask> transferTaskList = this.d.getTransferTaskList();
        for (int i = 0; i < transferTaskList.size(); i++) {
            PhoneWifiFtpUtil.TransferTask transferTask = transferTaskList.get(i);
            if (transferTask.getState() == 3) {
                arrayList.add(transferTask);
            }
        }
        if (arrayList.size() > 0) {
            PhoneWifiFtpUtil.TransferTask[] transferTaskArr = new PhoneWifiFtpUtil.TransferTask[arrayList.size()];
            arrayList.toArray(transferTaskArr);
            this.d.retryTransferTask(transferTaskArr);
        }
    }
}

package com.ximalaya.ting.android.sdkdownloader;

import android.app.Application;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.model.album.SubordinatedAlbum;
import com.ximalaya.ting.android.opensdk.model.track.BatchTrackList;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.XmPlayerManager;
import com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessHandle;
import com.ximalaya.ting.android.player.MD5;
import com.ximalaya.ting.android.player.XMediaPlayerConstants;
import com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager;
import com.ximalaya.ting.android.sdkdownloader.db.XmDbManagerImpl;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DoSomethingProgressWrapper;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadCallBackViewHolder;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadState;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.ITransferFileProgress;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.IXmDownloadTrackCallBack;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.TransferFileProgressWrapper;
import com.ximalaya.ting.android.sdkdownloader.exception.AddDownloadException;
import com.ximalaya.ting.android.sdkdownloader.exception.BaseRuntimeException;
import com.ximalaya.ting.android.sdkdownloader.exception.DbException;
import com.ximalaya.ting.android.sdkdownloader.exception.TransferSavePathException;
import com.ximalaya.ting.android.sdkdownloader.http.DownloadTask;
import com.ximalaya.ting.android.sdkdownloader.http.RequestParams;
import com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker;
import com.ximalaya.ting.android.sdkdownloader.http.loader.FileLoader;
import com.ximalaya.ting.android.sdkdownloader.model.XmDownloadAlbum;
import com.ximalaya.ting.android.sdkdownloader.model.XmDownloadAlbumHaveTracks;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;
import com.ximalaya.ting.android.sdkdownloader.task.PriorityExecutor;
import com.ximalaya.ting.android.sdkdownloader.task.TaskController;
import com.ximalaya.ting.android.sdkdownloader.task.TaskControllerImpl;
import com.ximalaya.ting.android.sdkdownloader.util.FileUtil;
import com.ximalaya.ting.android.sdkdownloader.util.IOUtil;
import com.ximalaya.ting.android.sdkdownloader.util.XmUtils;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes22.dex */
public final class XmDownloadManager implements IDownloadManager, IXmCommonBusinessHandle {
    private static final String r = "XmDownloadManager";
    private static volatile XmDownloadManager s;
    private final Application a;
    private String b;
    private final IXmDbManager c;
    private final TaskController d;
    private final PriorityExecutor e;
    private final long f;
    private final int g;
    private RequestTracker h;
    private int i;
    private Config j;
    private final Map<Long, Track> k;
    private final Map<Long, Track> l;
    private final ConcurrentHashMap<Long, com.ximalaya.ting.android.sdkdownloader.a> m;
    private IDoSomethingProgress n;
    private List<Integer> o;
    private Map<Integer, Set<DownloadCallBackViewHolder>> p;
    private List<IXmDownloadTrackCallBack> q;

    public static final class Builder {
        private String a;
        private Application b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;
        private RequestTracker h;
        private int i;
        private boolean j;

        public /* synthetic */ Builder(Application application, k kVar) {
            this(application);
        }

        public Builder connectionTimeOut(int i) {
            this.e = i;
            return this;
        }

        public XmDownloadManager create() {
            if (XmDownloadManager.s == null) {
                synchronized (XmDownloadManager.class) {
                    if (XmDownloadManager.s == null) {
                        XmDownloadManager unused = XmDownloadManager.s = new XmDownloadManager(this, null);
                    }
                }
            }
            return XmDownloadManager.s;
        }

        public Builder fifo(boolean z) {
            this.j = z;
            return this;
        }

        public Builder maxDownloadThread(@IntRange(from = 1, to = 3) int i) {
            this.c = i;
            return this;
        }

        public Builder maxRetryCount(int i) {
            this.g = i;
            return this;
        }

        public Builder maxSpaceSize(long j) {
            this.d = j;
            return this;
        }

        public Builder progressCallBackMaxTimeSpan(int i) {
            this.i = i;
            return this;
        }

        public Builder readTimeOut(int i) {
            this.f = i;
            return this;
        }

        public Builder requestTracker(RequestTracker requestTracker) {
            this.h = requestTracker;
            return this;
        }

        public Builder savePath(String str) {
            XmDownloadManager.A(str);
            this.a = str;
            return this;
        }

        private Builder(@NonNull Application application) {
            this.c = 1;
            this.d = Long.MAX_VALUE;
            this.e = 30000;
            this.f = 30000;
            this.g = 2;
            this.i = 800;
            this.j = false;
            this.b = application;
            File externalFilesDir = application.getExternalFilesDir("xmdownload");
            if (externalFilesDir == null) {
                this.a = new File(application.getFilesDir(), "xmdownload").getAbsolutePath();
            } else {
                this.a = externalFilesDir.getAbsolutePath();
            }
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ DoSomethingProgressWrapper b;

        public a(List list, DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = list;
            this.b = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            XmDownloadManager.this.z(this.a, true, false);
            this.b.success();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ DoSomethingProgressWrapper a;

        public b(DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            XmDownloadManager xmDownloadManager = XmDownloadManager.this;
            xmDownloadManager.z(xmDownloadManager.k.values(), true, false);
            this.a.success();
        }
    }

    public class c extends ArrayList<Long> {
        public final /* synthetic */ long a;

        public c(long j) {
            this.a = j;
            add(Long.valueOf(j));
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ DoSomethingProgressWrapper b;

        public d(List list, DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = list;
            this.b = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = this.a.size() == 1;
            ArrayList arrayList = new ArrayList();
            for (Long l : this.a) {
                com.ximalaya.ting.android.sdkdownloader.a aVar = (com.ximalaya.ting.android.sdkdownloader.a) XmDownloadManager.this.m.get(l);
                if (aVar == null) {
                    Track track = (Track) XmDownloadManager.this.k.get(l);
                    if (track != null) {
                        IOUtil.deleteFileOrDirByPath(XmUtils.tempPathByDownloadSavePath(track.getDownloadedSaveFilePath()));
                        if (z) {
                            XmDownloadManager.this.handlerOnRemoved(track, new Callback.RemovedException("removed by user"));
                        } else {
                            XmDownloadManager.this.k.remove(l);
                            arrayList.add(l);
                        }
                    }
                } else if (aVar.c()) {
                    aVar.cancleAndRemove();
                } else {
                    aVar.removeTaskFromQueue();
                    aVar.f();
                    arrayList.add(l);
                    XmDownloadManager.this.k.remove(l);
                }
            }
            if (!arrayList.isEmpty()) {
                XmDownloadManager.this.db().batchDelete(arrayList, false);
            }
            this.b.success();
        }
    }

    public class e extends ArrayList<Long> {
        public final /* synthetic */ long a;

        public e(long j) {
            this.a = j;
            add(Long.valueOf(j));
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ DoSomethingProgressWrapper b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                XmDownloadManager.this.onlyHanlderOnRemovedDownloaded();
                f.this.b.success();
            }
        }

        public f(List list, DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = list;
            this.b = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (XmDownloadManager.class) {
                XmDownloadManager.this.c.batchDelete(this.a, true);
            }
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                Track track = (Track) XmDownloadManager.this.l.remove((Long) it2.next());
                if (track != null) {
                    IOUtil.deleteFileOrDirByPath(track.getDownloadedSaveFilePath());
                }
            }
            XmDownloadManager.this.task().autoPost(new a());
        }
    }

    public class g implements IDoSomethingProgress {
        public g() {
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void begin() {
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void fail(BaseRuntimeException baseRuntimeException) {
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void success() {
            XmDownloadManager.this.c.release();
            XmDownloadManager.this.m.clear();
            XmDownloadManager.this.k.clear();
            XmDownloadManager.this.l.clear();
            XmDownloadManager unused = XmDownloadManager.s = null;
        }
    }

    public class h implements IDoSomethingProgress {
        public final /* synthetic */ String a;
        public final /* synthetic */ TransferFileProgressWrapper b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (Track track : XmDownloadManager.this.k.values()) {
                    String strTempPathByDownloadSavePath = XmUtils.tempPathByDownloadSavePath(track.getDownloadedSaveFilePath());
                    String strF = XmDownloadManager.F(strTempPathByDownloadSavePath, h.this.a, track);
                    if (new File(strTempPathByDownloadSavePath).exists()) {
                        if (!TextUtils.isEmpty(strF) && !strF.equals(track.getDownloadedSaveFilePath())) {
                            try {
                                if (!FileUtil.copy(strTempPathByDownloadSavePath, strF)) {
                                    throw new TransferSavePathException(TransferSavePathException.CODE_FILE_TRANSFER_ERROR, "文件转移失败", track);
                                }
                                if (!XmDownloadManager.this.db().changeDownloadSavePath(track.getDataId(), strF)) {
                                    throw new TransferSavePathException(TransferSavePathException.CODE_DB_ERROR, "数据库保存失败", track);
                                }
                                IOUtil.deleteFileOrDirByPath(strTempPathByDownloadSavePath);
                                track.setDownloadedSaveFilePath(strF);
                            } catch (TransferSavePathException e) {
                                IOUtil.deleteFileOrDirByPath(strF);
                                h.this.b.fail(e);
                            } catch (Throwable th) {
                                IOUtil.deleteFileOrDirByPath(strF);
                                h.this.b.fail(new TransferSavePathException(TransferSavePathException.CODE_FILE_TRANSFER_ERROR, "文件转移失败:" + th.getLocalizedMessage(), track));
                            }
                        }
                    } else if (XmDownloadManager.this.db().changeDownloadSavePath(track.getDataId(), strF)) {
                        track.setDownloadedSaveFilePath(strF);
                    } else {
                        h.this.b.fail(new TransferSavePathException(TransferSavePathException.CODE_FILE_TRANSFER_ERROR, "数据库保存失败", track));
                    }
                }
                int size = XmDownloadManager.this.l.size();
                int i = 0;
                long jCurrentTimeMillis = 0;
                for (Track track2 : XmDownloadManager.this.l.values()) {
                    String strF2 = XmDownloadManager.F(track2.getDownloadedSaveFilePath(), h.this.a, track2);
                    if (!TextUtils.isEmpty(strF2) && !strF2.equals(track2.getDownloadedSaveFilePath())) {
                        try {
                            if (!FileUtil.copy(track2.getDownloadedSaveFilePath(), strF2)) {
                                throw new TransferSavePathException(TransferSavePathException.CODE_FILE_TRANSFER_ERROR, "文件转移失败", track2);
                            }
                            if (!XmDownloadManager.this.db().changeDownloadSavePath(track2.getDataId(), strF2)) {
                                throw new TransferSavePathException(TransferSavePathException.CODE_DB_ERROR, "数据库保存失败", track2);
                            }
                            IOUtil.deleteFileOrDirByPath(track2.getDownloadedSaveFilePath());
                            track2.setDownloadedSaveFilePath(strF2);
                            i++;
                            if (System.currentTimeMillis() - jCurrentTimeMillis > 300 || i == size) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                                h.this.b.progress(i, size, track2);
                            }
                        } catch (TransferSavePathException e2) {
                            IOUtil.deleteFileOrDirByPath(strF2);
                            h.this.b.fail(e2);
                        } catch (Throwable th2) {
                            IOUtil.deleteFileOrDirByPath(strF2);
                            h.this.b.fail(new TransferSavePathException(TransferSavePathException.CODE_FILE_TRANSFER_ERROR, "文件转移失败:" + th2.getLocalizedMessage(), track2));
                        }
                    }
                }
                h hVar = h.this;
                XmDownloadManager.this.changeSavePath(hVar.a);
                h.this.b.success();
            }
        }

        public h(String str, TransferFileProgressWrapper transferFileProgressWrapper) {
            this.a = str;
            this.b = transferFileProgressWrapper;
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void begin() {
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void fail(BaseRuntimeException baseRuntimeException) {
            this.b.fail(new TransferSavePathException(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, baseRuntimeException.getMessage()));
        }

        @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
        public void success() {
            XmDownloadManager.this.task().run(new a());
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ Map a;
        public final /* synthetic */ DoSomethingProgressWrapper b;

        public i(Map map, DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = map;
            this.b = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Track track : XmDownloadManager.this.l.values()) {
                track.setOrderPositon(((Integer) this.a.get(Long.valueOf(track.getDataId()))).intValue());
            }
            XmDownloadManager.this.db().updateDownloadedTrackPosition(this.a);
            this.b.success();
        }
    }

    public class j extends ArrayList<Track> {
        public final /* synthetic */ Track a;

        public j(Track track) {
            this.a = track;
            add(track);
        }
    }

    public class k extends ArrayList<Long> {
        public final /* synthetic */ long a;

        public k(long j) {
            this.a = j;
            add(Long.valueOf(j));
        }
    }

    public class l implements Runnable {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(XmDownloadManager.this.a, this.a, 0).show();
        }
    }

    public class m implements Runnable {
        public final /* synthetic */ Track a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = XmDownloadManager.this.I().iterator();
                while (it2.hasNext()) {
                    ((DownloadCallBackViewHolder) it2.next()).onRemoved();
                }
                Iterator it3 = XmDownloadManager.this.q.iterator();
                while (it3.hasNext()) {
                    ((IXmDownloadTrackCallBack) it3.next()).onRemoved();
                }
            }
        }

        public m(Track track) {
            this.a = track;
        }

        @Override // java.lang.Runnable
        public void run() {
            Track track = (Track) XmDownloadManager.this.k.remove(Long.valueOf(this.a.getDataId()));
            if (track != null) {
                XmDownloadManager.this.m.remove(Long.valueOf(track.getDataId()));
                XmDownloadManager.this.c.delete(track.getDataId(), false);
            }
            XmDownloadManager.this.task().autoPost(new a());
        }
    }

    public class n implements IDataCallBack<BatchTrackList> {
        public final /* synthetic */ DoSomethingProgressWrapper a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ IDoSomethingProgress d;

        public n(DoSomethingProgressWrapper doSomethingProgressWrapper, List list, boolean z, IDoSomethingProgress iDoSomethingProgress) {
            this.a = doSomethingProgressWrapper;
            this.b = list;
            this.c = z;
            this.d = iDoSomethingProgress;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BatchTrackList batchTrackList) {
            XmDownloadManager.this.B(batchTrackList, this.a, this.b, this.c, this.d);
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            XmDownloadManager.this.J(i, str, this.a);
        }
    }

    public class o implements IDataCallBack<BatchTrackList> {
        public final /* synthetic */ DoSomethingProgressWrapper a;
        public final /* synthetic */ List b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ IDoSomethingProgress d;

        public o(DoSomethingProgressWrapper doSomethingProgressWrapper, List list, boolean z, IDoSomethingProgress iDoSomethingProgress) {
            this.a = doSomethingProgressWrapper;
            this.b = list;
            this.c = z;
            this.d = iDoSomethingProgress;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BatchTrackList batchTrackList) {
            XmDownloadManager.this.B(batchTrackList, this.a, this.b, this.c, this.d);
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            XmDownloadManager.this.J(i, str, this.a);
        }
    }

    public class p implements Runnable {
        public final /* synthetic */ List a;
        public final /* synthetic */ DoSomethingProgressWrapper b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ IDoSomethingProgress d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p pVar = p.this;
                if (pVar.d != null) {
                    pVar.b.success();
                } else if (XmDownloadManager.this.n != null) {
                    XmDownloadManager.this.n.success();
                }
            }
        }

        public p(List list, DoSomethingProgressWrapper doSomethingProgressWrapper, boolean z, IDoSomethingProgress iDoSomethingProgress) {
            this.a = list;
            this.b = doSomethingProgressWrapper;
            this.c = z;
            this.d = iDoSomethingProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.a.iterator();
            long downloadSize = 0;
            while (it2.hasNext()) {
                downloadSize += ((Track) it2.next()).getDownloadSize();
            }
            if (!FileUtil.checkDownloadPathSize(downloadSize, XmDownloadManager.this.b)) {
                XmDownloadManager.this.J(AddDownloadException.CODE_DISK_OVER, "磁盘已满", this.b);
                XmDownloadManager.this.pauseAllDownloads(null);
            } else if (XmDownloadManager.this.f != Long.MAX_VALUE && XmDownloadManager.this.getDownloadedFileSize() + downloadSize > XmDownloadManager.this.f) {
                XmDownloadManager.this.J(AddDownloadException.CODE_MAX_SPACE_OVER, "下载的音频所占空间已经超过了最大值", this.b);
            } else {
                XmDownloadManager.this.y(this.a, this.c);
                XmDownloadManager.this.task().post(new a());
            }
        }
    }

    public class q implements Runnable {
        public final /* synthetic */ DoSomethingProgressWrapper a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;

        public q(DoSomethingProgressWrapper doSomethingProgressWrapper, int i, String str) {
            this.a = doSomethingProgressWrapper;
            this.b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DoSomethingProgressWrapper doSomethingProgressWrapper = this.a;
            if (doSomethingProgressWrapper != null) {
                doSomethingProgressWrapper.fail(new AddDownloadException(this.b, this.c));
            } else if (XmDownloadManager.this.n != null) {
                XmDownloadManager.this.n.fail(new AddDownloadException(this.b, this.c));
            } else {
                XmDownloadManager.this.K(this.c);
            }
        }
    }

    public class r extends ArrayList<Long> {
        public final /* synthetic */ long a;

        public r(long j) {
            this.a = j;
            add(Long.valueOf(j));
        }
    }

    public class s implements Runnable {
        public final /* synthetic */ Collection a;
        public final /* synthetic */ DoSomethingProgressWrapper b;

        public s(Collection collection, DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = collection;
            this.b = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            for (Long l : this.a) {
                com.ximalaya.ting.android.sdkdownloader.a aVar = (com.ximalaya.ting.android.sdkdownloader.a) XmDownloadManager.this.m.get(l);
                if (aVar != null) {
                    if (aVar.c()) {
                        aVar.cancel();
                    } else {
                        aVar.removeTaskFromQueue();
                        aVar.f();
                        arrayList.add(l);
                        ((Track) XmDownloadManager.this.k.get(l)).setDownloadStatus(DownloadState.STOPPED.value());
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                XmDownloadManager.this.db().setAllTrackStatue(DownloadState.WAITING, DownloadState.STOPPED, arrayList);
            }
            this.b.success();
        }
    }

    public class t implements Runnable {
        public final /* synthetic */ DoSomethingProgressWrapper a;

        public t(DoSomethingProgressWrapper doSomethingProgressWrapper) {
            this.a = doSomethingProgressWrapper;
        }

        @Override // java.lang.Runnable
        public void run() {
            XmDownloadManager.this.e.clean();
            for (com.ximalaya.ting.android.sdkdownloader.a aVar : XmDownloadManager.this.m.values()) {
                if (aVar.c()) {
                    aVar.cancel();
                } else {
                    aVar.f();
                }
            }
            Collection collectionValues = XmDownloadManager.this.k.values();
            int iValue = DownloadState.STOPPED.value();
            synchronized (XmDownloadManager.this.k) {
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((Track) it2.next()).setDownloadStatus(iValue);
                }
            }
            XmDownloadManager.this.db().setAllTrackStatue(DownloadState.WAITING, DownloadState.STOPPED);
            this.a.success();
        }
    }

    public class u extends ArrayList<Long> {
        public final /* synthetic */ long a;

        public u(long j) {
            this.a = j;
            add(Long.valueOf(j));
        }
    }

    public static class v {
        private RequestParams a;
        private com.ximalaya.ting.android.sdkdownloader.a b;

        public v(XmDownloadManager xmDownloadManager, Track track) {
            com.ximalaya.ting.android.sdkdownloader.a aVar = new com.ximalaya.ting.android.sdkdownloader.a(track);
            this.b = aVar;
            aVar.h(xmDownloadManager);
            this.a = new RequestParams(track.getDownloadUrl(), track.isPaid() ? FileLoader.DATA_SAVE_TYPE_PAY : FileLoader.DATA_SAVE_TYPE_FREE);
            Config config = xmDownloadManager.j;
            if (config.useProxy && !TextUtils.isEmpty(config.proxyHost) && config.proxyPort > 0) {
                this.a.setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(config.proxyHost, config.proxyPort)));
            } else {
                this.a.setProxy(null);
            }
            this.a.setConnectTimeout(config.connectionTimeOut);
            this.a.setReadTimeOut(config.readTimeOut);
            this.a.setAutoResume(true);
            this.a.setMaxRetryCount(xmDownloadManager.g);
            this.a.setRequestTracker(xmDownloadManager.h);
            this.a.setLoadingUpdateMaxTimeSpan(xmDownloadManager.i);
            this.a.setSaveFilePath(track.getDownloadedSaveFilePath());
            this.a.setExecutor(xmDownloadManager.e);
            this.a.setCancelFast(true);
            this.a.setTrackId(track.getDataId());
        }
    }

    public /* synthetic */ XmDownloadManager(Builder builder, k kVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("savePath 不能为null");
        }
        if (!FileUtil.fileIsExistCreate(str).canWrite()) {
            throw new IllegalStateException("savePath 不可写!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(BatchTrackList batchTrackList, DoSomethingProgressWrapper doSomethingProgressWrapper, List<Long> list, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        if (batchTrackList == null || batchTrackList.getTracks() == null || batchTrackList.getTracks().isEmpty()) {
            J(AddDownloadException.CODE_NOT_FIND_TRACK, "不能找到相应的声音", doSomethingProgressWrapper);
            return;
        }
        ArrayList<Track> arrayList = new ArrayList();
        for (Track track : batchTrackList.getTracks()) {
            if (track.isCanDownload()) {
                arrayList.add(track);
            }
        }
        if (list.isEmpty()) {
            J(AddDownloadException.CODE_NOT_FIND_TRACK, "不能找到相应的声音", doSomethingProgressWrapper);
            return;
        }
        for (Track track2 : arrayList) {
            if (track2.isPaid() && !track2.isAuthorized() && !track2.isTrailer() && !track2.isFree()) {
                J(AddDownloadException.CODE_NO_PAY_SOUND, "下载的付费音频中有没有支付", doSomethingProgressWrapper);
                return;
            }
        }
        if (this.k.size() + arrayList.size() > 500) {
            J(AddDownloadException.CODE_MAX_DOWNLOADING_COUNT, "同时下载的音频个数不能超过500", doSomethingProgressWrapper);
        } else {
            task().run(new p(arrayList, doSomethingProgressWrapper, z, iDoSomethingProgress));
        }
    }

    public static Builder Builder(@NonNull Application application) throws IllegalStateException {
        if (application != null) {
            return new Builder(application, null);
        }
        throw new IllegalArgumentException("application 不能为null");
    }

    private <T> Callback.Cancelable C(v vVar) {
        return this.d.start(new DownloadTask(vVar.a, vVar.b, vVar.b));
    }

    private String D(Track track) {
        String str = this.b;
        String str2 = File.separator;
        boolean zEndsWith = str.endsWith(str2);
        String str3 = XMediaPlayerConstants.X2M_SUFFIX;
        if (zEndsWith) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(track.getDataId());
            sb.append(MD5.md5(track.getDownloadUrl()));
            if (!track.isPaid()) {
                str3 = "";
            }
            sb.append(str3);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        sb2.append(str2);
        sb2.append(track.getDataId());
        sb2.append(MD5.md5(track.getDownloadUrl()));
        if (!track.isPaid()) {
            str3 = "";
        }
        sb2.append(str3);
        return sb2.toString();
    }

    private <T> Callback.Cancelable E(v vVar) {
        return this.d.startNoCallWaiting(new DownloadTask(vVar.a, vVar.b, vVar.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String F(String str, String str2, Track track) {
        int iLastIndexOf;
        if (str == null || (iLastIndexOf = str.lastIndexOf(File.separator)) <= 0) {
            return null;
        }
        return str2 + str.substring(iLastIndexOf);
    }

    private List<Long> G(Map<Long, Track> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (map) {
            arrayList.addAll(map.keySet());
        }
        return arrayList;
    }

    private List<Long> H(long j2, Map<Long, Track> map) {
        if (map == null || map.isEmpty()) {
            return XmUtils.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (map) {
            Iterator<Map.Entry<Long, Track>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Track value = it2.next().getValue();
                if (value != null && value.getAlbum() != null && value.getAlbum().getAlbumId() == j2) {
                    arrayList.add(Long.valueOf(value.getDataId()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<DownloadCallBackViewHolder> I() {
        List<Integer> list = this.o;
        if (list == null || list.size() < 1) {
            return XmUtils.emptySet();
        }
        Map<Integer, Set<DownloadCallBackViewHolder>> map = this.p;
        List<Integer> list2 = this.o;
        Set<DownloadCallBackViewHolder> set = map.get(list2.get(list2.size() - 1));
        return set == null ? XmUtils.emptySet() : set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(int i2, String str, DoSomethingProgressWrapper<AddDownloadException> doSomethingProgressWrapper) {
        task().autoPost(new q(doSomethingProgressWrapper, i2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(String str) {
        task().autoPost(new l(str));
    }

    private synchronized void L(Track track, boolean z) throws DbException {
        y(new j(track), z);
    }

    public static XmDownloadManager getInstance() {
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public synchronized void y(Collection<Track> collection, boolean z) {
        z(collection, z, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public synchronized void z(Collection<Track> collection, boolean z, boolean z2) {
        Callback.Cancelable cancelableE;
        if (z2) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    while (collection.remove(null)) {
                    }
                    HashSet hashSet = new HashSet();
                    synchronized (this.k) {
                        for (Track track : collection) {
                            track.setDownloadedSaveFilePath(D(track));
                            hashSet.add(Long.valueOf(track.getDataId()));
                        }
                    }
                    List<Track> tracksByIds = this.c.getTracksByIds(hashSet);
                    if (tracksByIds != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Track track2 : tracksByIds) {
                            if (track2.getDownloadStatus() == DownloadState.FINISHED.value() && new File(track2.getDownloadedSaveFilePath()).exists()) {
                                arrayList.add(track2);
                            }
                        }
                        if (collection.removeAll(arrayList)) {
                            if (collection.size() == 0) {
                                K("已下载");
                                return;
                            }
                            K("部分已下载");
                        }
                        ArrayList arrayList2 = new ArrayList(collection);
                        arrayList2.removeAll(tracksByIds);
                        this.c.saveTrackList(arrayList2);
                    } else {
                        this.c.saveTrackList(collection);
                    }
                }
            }
            return;
        }
        boolean z3 = true;
        if (collection.size() != 1) {
            z3 = false;
        }
        if (!z3) {
            db().setAllTrackStatueExcludeFinished(DownloadState.WAITING);
        }
        for (Track track3 : collection) {
            if (z) {
                v vVar = new v(this, track3);
                if (z3) {
                    cancelableE = C(vVar);
                } else {
                    track3.setDownloadStatus(DownloadState.WAITING.value());
                    cancelableE = E(vVar);
                }
                vVar.b.g(cancelableE);
                this.m.put(Long.valueOf(track3.getDataId()), vVar.b);
            }
            if (z2) {
                this.k.put(Long.valueOf(track3.getDataId()), track3);
            }
        }
    }

    public void addDownloadCallBackViewHolder(int i2, @NonNull DownloadCallBackViewHolder downloadCallBackViewHolder) {
        if (i2 == 0) {
            throw new IllegalArgumentException("pageCode 不能为0");
        }
        this.o.add(Integer.valueOf(i2));
        Set<DownloadCallBackViewHolder> copyOnWriteArraySet = this.p.get(Integer.valueOf(i2));
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.p.put(Integer.valueOf(i2), copyOnWriteArraySet);
        }
        copyOnWriteArraySet.add(downloadCallBackViewHolder);
    }

    public void addDownloadStatueListener(IXmDownloadTrackCallBack iXmDownloadTrackCallBack) {
        if (this.q.contains(iXmDownloadTrackCallBack)) {
            return;
        }
        this.q.add(iXmDownloadTrackCallBack);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public boolean albumHaveDownloadingTrack(long j2) {
        List<Long> listG = G(this.k);
        if (listG != null && !listG.isEmpty()) {
            Iterator<Long> it2 = listG.iterator();
            while (it2.hasNext()) {
                if (this.k.get(Long.valueOf(it2.next().longValue())).getDownloadStatus() == DownloadState.STARTED.value()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Application app() {
        return this.a;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void batchCancelDownloadTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        if (list == null || list.isEmpty()) {
            doSomethingProgressWrapper.fail(new BaseRuntimeException("参数不能为null"));
        } else {
            task().autoRun(new d(list, doSomethingProgressWrapper));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void batchClearDownloadedTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        if (list == null || list.isEmpty()) {
            doSomethingProgressWrapper.fail(new BaseRuntimeException("参数不能为null"));
        } else {
            task().autoRun(new f(list, doSomethingProgressWrapper));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public Map<Long, DownloadState> batchGetTracksDownloadStatus(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return XmUtils.emptyMap();
        }
        HashMap map = new HashMap();
        if (this.k.isEmpty() && this.l.isEmpty()) {
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                map.put(it2.next(), DownloadState.NOADD);
            }
            return map;
        }
        for (Long l2 : list) {
            Track track = this.k.get(l2);
            if (track != null) {
                map.put(Long.valueOf(track.getDataId()), DownloadState.valueOf(track.getDownloadStatus()));
            } else if (this.l.containsKey(l2)) {
                map.put(l2, DownloadState.FINISHED);
            } else {
                map.put(l2, DownloadState.NOADD);
            }
        }
        return map;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void batchPauseDownloadTracks(Collection<Long> collection, IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        if (collection == null || collection.isEmpty()) {
            doSomethingProgressWrapper.fail(new BaseRuntimeException("参数不能为null"));
        } else {
            task().run(new s(collection, doSomethingProgressWrapper));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void batchResumeDownloadTracks(List<Long> list, IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        if (list == null || list.isEmpty()) {
            doSomethingProgressWrapper.fail(new BaseRuntimeException("参数不能为null"));
            return;
        }
        Map<Long, Track> map = this.k;
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            Track track = this.k.get(it2.next());
            if (track != null) {
                arrayList.add(track);
            }
        }
        task().autoRun(new a(arrayList, doSomethingProgressWrapper));
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void cancelAllDownloads(IDoSomethingProgress iDoSomethingProgress) {
        batchCancelDownloadTracks(G(this.k), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void cancelDownloadSingleTrack(long j2) {
        batchCancelDownloadTracks(new c(j2), null);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void cancelDownloadTracksInAlbum(long j2, IDoSomethingProgress iDoSomethingProgress) {
        batchCancelDownloadTracks(H(j2, this.k), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void changeSavePath(@NonNull String str) {
        A(str);
        this.b = str;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void changeSavePathAndTransfer(@NonNull String str, @NonNull ITransferFileProgress iTransferFileProgress) {
        if (iTransferFileProgress == null) {
            K("transferProgress 不能为null");
            return;
        }
        TransferFileProgressWrapper transferFileProgressWrapper = new TransferFileProgressWrapper(iTransferFileProgress);
        transferFileProgressWrapper.begin();
        try {
            A(str);
            pauseAllDownloads(new h(str, transferFileProgressWrapper));
        } catch (Exception e2) {
            transferFileProgressWrapper.fail(new TransferSavePathException(TransferSavePathException.CODE_SAVE_PATH_NO_SAVE, e2.getLocalizedMessage()));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void clearAllDownloadedTracks(IDoSomethingProgress iDoSomethingProgress) {
        batchClearDownloadedTracks(G(this.l), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void clearDownloadedAlbum(long j2, IDoSomethingProgress iDoSomethingProgress) {
        batchClearDownloadedTracks(H(j2, this.l), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void clearDownloadedTrack(long j2) {
        batchClearDownloadedTracks(new e(j2), null);
    }

    @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessHandle
    public void closeApp() {
    }

    public IXmDbManager db() {
        return this.c;
    }

    public void destoryDownloadCallBackViewHolder(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("pageCode 不能为0");
        }
        this.o.remove(new Integer(i2));
        this.p.remove(Integer.valueOf(i2));
    }

    public void downloadPayTracks(List<Long> list, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        DoSomethingProgressWrapper<AddDownloadException> doSomethingProgressWrapper = new DoSomethingProgressWrapper<>(iDoSomethingProgress);
        if (iDoSomethingProgress != null) {
            doSomethingProgressWrapper.begin();
        } else {
            IDoSomethingProgress iDoSomethingProgress2 = this.n;
            if (iDoSomethingProgress2 != null) {
                iDoSomethingProgress2.begin();
            }
        }
        if (list == null || list.isEmpty()) {
            J(AddDownloadException.CODE_NULL, "参数不能为空", doSomethingProgressWrapper);
        } else {
            if (list.size() > this.f) {
                J(AddDownloadException.CODE_MAX_OVER, "批量下载最大不能超过50条", doSomethingProgressWrapper);
                return;
            }
            HashMap map = new HashMap();
            map.put("ids", XmUtils.converToString(list));
            CommonRequest.batchPaidTracks(map, new o(doSomethingProgressWrapper, list, z, iDoSomethingProgress));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void downloadSingleTrack(long j2, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        downloadSingleTrack(j2, true, iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void downloadTracks(List<Long> list, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        downloadTracks(list, true, iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public Map<Long, DownloadState> getAllDownloadStatus() {
        List<Long> listG = G(this.k);
        if (listG != null) {
            listG.addAll(G(this.l));
        }
        return batchGetTracksDownloadStatus(listG);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x002d A[SYNTHETIC] */
    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public List<XmDownloadAlbum> getDownloadAlbums(boolean z) {
        XmDownloadAlbum albumByTrack;
        Map<Long, Track> map = z ? this.l : this.k;
        if (map.isEmpty()) {
            return XmUtils.emptyList();
        }
        Collection<Track> collectionValues = map.values();
        int iValue = DownloadState.FINISHED.value();
        HashMap map2 = new HashMap();
        synchronized ((z ? this.l : this.k)) {
            for (Track track : collectionValues) {
                SubordinatedAlbum album = track.getAlbum();
                if (z) {
                    if (track.getDownloadStatus() == iValue) {
                        if (map2.containsKey(Long.valueOf(album.getAlbumId()))) {
                            XmDownloadAlbum xmDownloadAlbum = (XmDownloadAlbum) map2.get(Long.valueOf(album.getAlbumId()));
                            xmDownloadAlbum.setTrackCount(xmDownloadAlbum.getTrackCount() + 1);
                            xmDownloadAlbum.setDownloadTrackSize(xmDownloadAlbum.getDownloadTrackSize() + track.getDownloadSize());
                        } else {
                            albumByTrack = XmDownloadAlbum.getAlbumByTrack(track);
                            if (albumByTrack != null) {
                                map2.put(Long.valueOf(album.getAlbumId()), albumByTrack);
                            }
                        }
                    }
                } else if (track.getDownloadStatus() != iValue && album != null) {
                    if (map2.containsKey(Long.valueOf(album.getAlbumId()))) {
                        XmDownloadAlbum xmDownloadAlbum2 = (XmDownloadAlbum) map2.get(Long.valueOf(album.getAlbumId()));
                        xmDownloadAlbum2.setTrackCount(xmDownloadAlbum2.getTrackCount() + 1);
                        xmDownloadAlbum2.setDownloadTrackSize(xmDownloadAlbum2.getDownloadTrackSize() + track.getDownloadSize());
                    } else {
                        albumByTrack = XmDownloadAlbum.getAlbumByTrack(track);
                        if (albumByTrack != null) {
                            map2.put(Long.valueOf(album.getAlbumId()), albumByTrack);
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map2.values());
        return arrayList;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public Track getDownloadInfo(long j2, boolean z) {
        return (z ? this.l : this.k).get(Long.valueOf(j2));
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public List<XmDownloadAlbumHaveTracks> getDownloadListByAlbum(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (XmDownloadAlbum xmDownloadAlbum : getDownloadAlbums(z)) {
            arrayList.add(new XmDownloadAlbumHaveTracks(xmDownloadAlbum, getDownloadTrackInAlbum(xmDownloadAlbum.getAlbumId(), z)));
        }
        return arrayList;
    }

    @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessHandle
    public String getDownloadPlayPath(Track track) {
        Track track2;
        return (track == null || (track2 = this.l.get(Long.valueOf(track.getDataId()))) == null) ? "" : track2.getDownloadedSaveFilePath();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public int getDownloadTrackCount(boolean z) {
        return (z ? this.l : this.k).size();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public List<Track> getDownloadTrackInAlbum(long j2, boolean z) {
        List<Long> listH = H(j2, z ? this.l : this.k);
        if (listH == null || listH.isEmpty()) {
            return XmUtils.emptyList();
        }
        return XmUtils.getListFromMapByKeys(listH, z ? this.l : this.k);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public List<Track> getDownloadTracks(boolean z) {
        return new ArrayList((z ? this.l : this.k).values());
    }

    public long getDownloadedFileSize() {
        long downloadSize;
        synchronized (this.l) {
            downloadSize = 0;
            for (Track track : this.l.values()) {
                downloadSize += track.getDownloadedSize() == 0 ? track.getDownloadSize() : track.getDownloadedSize();
            }
        }
        synchronized (this.k) {
            for (Track track2 : this.k.values()) {
                downloadSize += track2.getDownloadedSize() == 0 ? track2.getDownloadSize() : track2.getDownloadedSize();
            }
        }
        return downloadSize;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public String getHumanReadableDownloadOccupation(@IDownloadManager.DownloadSizePrecision int i2) {
        long downloadedFileSize = getDownloadedFileSize();
        String str = downloadedFileSize + "";
        if (i2 == 1) {
            return ((((downloadedFileSize * 1.0f) / 1024.0f) / 1024.0f) / 1024.0f) + "G";
        }
        if (i2 == 2) {
            return ((downloadedFileSize * 1.0f) / 1024.0f) + "KB";
        }
        if (i2 == 3) {
            return (((downloadedFileSize * 1.0f) / 1024.0f) / 1024.0f) + "MB";
        }
        if (i2 != 4) {
            return i2 != 5 ? str : XmUtils.getFriendlyFileSize(downloadedFileSize);
        }
        return downloadedFileSize + "B";
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public DownloadState getSingleTrackDownloadStatus(long j2) {
        Track track = this.k.get(Long.valueOf(j2));
        if (track != null) {
            return DownloadState.valueOf(track.getDownloadStatus());
        }
        return this.l.containsKey(Long.valueOf(j2)) ? DownloadState.FINISHED : DownloadState.NOADD;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public Map<Long, DownloadState> getTracksInAlbumDownloadStatus(long j2) {
        List<Long> listH = H(j2, this.k);
        if (listH == null) {
            listH = new ArrayList<>();
        }
        listH.addAll(H(j2, this.l));
        return batchGetTracksDownloadStatus(listH);
    }

    public void handleOnWaiting(Track track) {
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onWaiting(track);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onWaiting(track);
        }
    }

    public void handlerOnCancelled(Track track, Callback.CancelledException cancelledException) {
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onCancelled(track, cancelledException);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onCancelled(track, cancelledException);
        }
    }

    public void handlerOnError(Track track, Throwable th) {
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onError(track, th);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onError(track, th);
        }
    }

    public void handlerOnProgress(Track track, long j2, long j3) {
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onProgress(track, j2, j3);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onProgress(track, j2, j3);
        }
    }

    public void handlerOnRemoved(Track track, Callback.RemovedException removedException) {
        task().autoRun(new m(track));
    }

    public void handlerOnStarted(Track track) {
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onStarted(track);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onStarted(track);
        }
    }

    public void handlerOnSuccess(Track track) {
        Track trackRemove = this.k.remove(Long.valueOf(track.getDataId()));
        if (trackRemove != null) {
            this.l.put(Long.valueOf(trackRemove.getDataId()), trackRemove);
            this.m.remove(Long.valueOf(trackRemove.getDataId()));
        }
        Iterator<DownloadCallBackViewHolder> it2 = I().iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess(track);
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onSuccess(track);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public boolean haveDowningTask() {
        if (this.k.isEmpty()) {
            return false;
        }
        Collection<Track> collectionValues = this.k.values();
        synchronized (this.k) {
            Iterator<Track> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (it2.next().getDownloadStatus() == DownloadState.STARTED.value()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.ximalaya.ting.android.opensdk.player.service.IXmCommonBusinessHandle
    public void isOldTrackDownload(Track track) {
    }

    public void onlyHanlderOnRemovedDownloaded() {
        Set<DownloadCallBackViewHolder> setI = I();
        if (setI != null) {
            Iterator<DownloadCallBackViewHolder> it2 = setI.iterator();
            while (it2.hasNext()) {
                it2.next().onRemoved();
            }
        }
        Iterator<IXmDownloadTrackCallBack> it3 = this.q.iterator();
        while (it3.hasNext()) {
            it3.next().onRemoved();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void pauseAllDownloads(IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        task().autoRun(new t(doSomethingProgressWrapper));
    }

    public void pauseDownloadCallBackViewHolder(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("pageCode 不能为0");
        }
        int iIndexOf = this.o.indexOf(new Integer(i2));
        if (iIndexOf != this.o.size() - 1 || this.o.size() <= 2) {
            return;
        }
        List<Integer> list = this.o;
        Collections.swap(list, iIndexOf, list.size() - 2);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void pauseDownloadSingleTrack(long j2) {
        batchPauseDownloadTracks(new r(j2), null);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void pauseDownloadTracksInAlbum(long j2, IDoSomethingProgress iDoSomethingProgress) {
        batchPauseDownloadTracks(H(j2, this.k), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void release() {
        pauseAllDownloads(new g());
        XmPlayerManager.getInstance(this.a).setCommonBusinessHandle(null);
        this.o.clear();
        this.p.clear();
        this.q.clear();
    }

    public void removeDownloadStatueListener(IXmDownloadTrackCallBack iXmDownloadTrackCallBack) {
        List<IXmDownloadTrackCallBack> list = this.q;
        if (list != null) {
            list.remove(iXmDownloadTrackCallBack);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void resumeAllDownloads(IDoSomethingProgress iDoSomethingProgress) {
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        task().run(new b(doSomethingProgressWrapper));
    }

    public void resumeDownloadCallBackViewHolder(int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("pageCode 不能为0");
        }
        int iIndexOf = this.o.indexOf(new Integer(i2));
        if (iIndexOf < 0 || iIndexOf == this.o.size() - 1) {
            return;
        }
        List<Integer> list = this.o;
        Collections.swap(list, iIndexOf, list.size() - 1);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void resumeDownloadSingleTrack(long j2) {
        batchResumeDownloadTracks(new u(j2), null);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void resumeDownloadTracksInAlbum(long j2, IDoSomethingProgress iDoSomethingProgress) {
        batchResumeDownloadTracks(H(j2, this.k), iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void setAddDownloadProgressListener(IDoSomethingProgress iDoSomethingProgress) {
        this.n = iDoSomethingProgress;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void setHttpConfig(Config config) {
        this.j = config;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void swapDownloadedPosition(@NonNull Map<Long, Integer> map, IDoSomethingProgress iDoSomethingProgress) {
        if (map == null || map.isEmpty()) {
            return;
        }
        DoSomethingProgressWrapper doSomethingProgressWrapper = new DoSomethingProgressWrapper(iDoSomethingProgress);
        doSomethingProgressWrapper.begin();
        task().autoRun(new i(map, doSomethingProgressWrapper));
    }

    public TaskController task() {
        return this.d;
    }

    public void updateDownloadInfo(Track track) throws DbException {
        this.c.update(track);
    }

    private XmDownloadManager(Builder builder) {
        this.k = Collections.synchronizedMap(new LinkedHashMap());
        this.l = Collections.synchronizedMap(new LinkedHashMap());
        this.m = new ConcurrentHashMap<>(5);
        this.o = new ArrayList();
        this.p = new ConcurrentHashMap();
        this.q = new CopyOnWriteArrayList();
        Application application = builder.b;
        this.a = application;
        this.b = builder.a;
        this.e = new PriorityExecutor(builder.c, builder.j);
        this.d = TaskControllerImpl.getInstance();
        XmDbManagerImpl xmDbManagerImpl = new XmDbManagerImpl(application);
        this.c = xmDbManagerImpl;
        this.f = builder.d;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        Config config = new Config();
        this.j = config;
        config.readTimeOut = builder.f;
        this.j.connectionTimeOut = builder.e;
        XmPlayerManager.getInstance(application).setCommonBusinessHandle(this);
        List<Track> listFindAll = xmDbManagerImpl.findAll();
        if (listFindAll != null) {
            for (Track track : listFindAll) {
                int downloadStatus = track.getDownloadStatus();
                DownloadState downloadState = DownloadState.FINISHED;
                if (downloadStatus == downloadState.value()) {
                    this.l.put(Long.valueOf(track.getDataId()), track);
                } else if (track.getDownloadStatus() < downloadState.value()) {
                    track.setDownloadStatus(DownloadState.STOPPED.value());
                    this.k.put(Long.valueOf(track.getDataId()), track);
                } else {
                    this.k.put(Long.valueOf(track.getDataId()), track);
                }
            }
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void downloadSingleTrack(long j2, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        downloadTracks(new k(j2), z, iDoSomethingProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDownloadManager
    public void downloadTracks(List<Long> list, boolean z, IDoSomethingProgress<AddDownloadException> iDoSomethingProgress) {
        DoSomethingProgressWrapper<AddDownloadException> doSomethingProgressWrapper = new DoSomethingProgressWrapper<>(iDoSomethingProgress);
        if (iDoSomethingProgress != null) {
            doSomethingProgressWrapper.begin();
        } else {
            IDoSomethingProgress iDoSomethingProgress2 = this.n;
            if (iDoSomethingProgress2 != null) {
                iDoSomethingProgress2.begin();
            }
        }
        if (list == null || list.isEmpty()) {
            J(AddDownloadException.CODE_NULL, "参数不能为空", doSomethingProgressWrapper);
        } else {
            if (list.size() > this.f) {
                J(AddDownloadException.CODE_MAX_OVER, "批量下载最大不能超过50条", doSomethingProgressWrapper);
                return;
            }
            HashMap map = new HashMap();
            map.put("ids", XmUtils.converToString(list));
            CommonRequest.getBatchTracks(map, new n(doSomethingProgressWrapper, list, z, iDoSomethingProgress));
        }
    }
}

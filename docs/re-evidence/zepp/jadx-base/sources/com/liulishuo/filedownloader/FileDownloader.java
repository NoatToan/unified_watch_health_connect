package com.liulishuo.filedownloader;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.download.CustomComponentHolder;
import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.liulishuo.filedownloader.model.FileDownloadTaskAtom;
import com.liulishuo.filedownloader.services.DownloadMgrInitialParams;
import com.liulishuo.filedownloader.util.FileDownloadHelper;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloader {
    private static final Object c = new Object();
    private static final Object d = new Object();
    private IQueuesHandler a;
    private ILostServiceConnectedHandler b;

    public static final class a {
        private static final FileDownloader a = new FileDownloader();

        private a() {
        }
    }

    public static void disableAvoidDropFrame() {
        setGlobalPost2UIInterval(-1);
    }

    public static void enableAvoidDropFrame() {
        setGlobalPost2UIInterval(10);
    }

    public static FileDownloader getImpl() {
        return a.a;
    }

    public static void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("the provided context must not be null!");
        }
        setup(context);
    }

    public static boolean isEnabledAvoidDropFrame() {
        return FileDownloadMessageStation.isIntervalValid();
    }

    public static void setGlobalHandleSubPackageSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("sub package size must more than 0");
        }
        FileDownloadMessageStation.i = i;
    }

    public static void setGlobalPost2UIInterval(int i) {
        FileDownloadMessageStation.h = i;
    }

    public static void setup(Context context) {
        FileDownloadHelper.holdContext(context.getApplicationContext());
    }

    public static DownloadMgrInitialParams.InitCustomMaker setupOnApplicationOnCreate(Application application) {
        FileDownloadHelper.holdContext(application.getApplicationContext());
        DownloadMgrInitialParams.InitCustomMaker initCustomMaker = new DownloadMgrInitialParams.InitCustomMaker();
        CustomComponentHolder.getImpl().setInitCustomMaker(initCustomMaker);
        return initCustomMaker;
    }

    public ILostServiceConnectedHandler a() {
        if (this.b == null) {
            synchronized (d) {
                if (this.b == null) {
                    LostServiceConnectedHandler lostServiceConnectedHandler = new LostServiceConnectedHandler();
                    this.b = lostServiceConnectedHandler;
                    addServiceConnectListener(lostServiceConnectedHandler);
                }
            }
        }
        return this.b;
    }

    public void addServiceConnectListener(FileDownloadConnectListener fileDownloadConnectListener) {
        FileDownloadEventPool.getImpl().addListener(DownloadServiceConnectChangedEvent.ID, fileDownloadConnectListener);
    }

    public IQueuesHandler b() {
        if (this.a == null) {
            synchronized (c) {
                if (this.a == null) {
                    this.a = new e();
                }
            }
        }
        return this.a;
    }

    public void bindService() {
        if (isServiceConnected()) {
            return;
        }
        FileDownloadServiceProxy.getImpl().bindStartByContext(FileDownloadHelper.getAppContext());
    }

    public boolean clear(int i, String str) {
        pause(i);
        if (!FileDownloadServiceProxy.getImpl().clearTaskData(i)) {
            return false;
        }
        File file = new File(FileDownloadUtils.getTempPath(str));
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(str);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    public void clearAllTaskData() {
        pauseAll();
        FileDownloadServiceProxy.getImpl().clearAllTaskData();
    }

    public BaseDownloadTask create(String str) {
        return new DownloadTask(str);
    }

    public long getSoFar(int i) {
        BaseDownloadTask.IRunningTask iRunningTask = FileDownloadList.getImpl().get(i);
        return iRunningTask == null ? FileDownloadServiceProxy.getImpl().getSofar(i) : iRunningTask.getOrigin().getLargeFileSoFarBytes();
    }

    public byte getStatus(String str, String str2) {
        return getStatus(FileDownloadUtils.generateId(str, str2), str2);
    }

    public byte getStatusIgnoreCompleted(int i) {
        return getStatus(i, (String) null);
    }

    public long getTotal(int i) {
        BaseDownloadTask.IRunningTask iRunningTask = FileDownloadList.getImpl().get(i);
        return iRunningTask == null ? FileDownloadServiceProxy.getImpl().getTotal(i) : iRunningTask.getOrigin().getLargeFileTotalBytes();
    }

    public FileDownloadLine insureServiceBind() {
        return new FileDownloadLine();
    }

    public FileDownloadLineAsync insureServiceBindAsync() {
        return new FileDownloadLineAsync();
    }

    public boolean isServiceConnected() {
        return FileDownloadServiceProxy.getImpl().isConnected();
    }

    public void pause(FileDownloadListener fileDownloadListener) {
        c.d().a(fileDownloadListener);
        Iterator<BaseDownloadTask.IRunningTask> it2 = FileDownloadList.getImpl().d(fileDownloadListener).iterator();
        while (it2.hasNext()) {
            it2.next().getOrigin().pause();
        }
    }

    public void pauseAll() {
        c.d().c();
        for (BaseDownloadTask.IRunningTask iRunningTask : FileDownloadList.getImpl().e()) {
            iRunningTask.getOrigin().pause();
        }
        if (FileDownloadServiceProxy.getImpl().isConnected()) {
            FileDownloadServiceProxy.getImpl().pauseAllTasks();
        } else {
            PauseAllMarker.createMarker();
        }
    }

    public void removeServiceConnectListener(FileDownloadConnectListener fileDownloadConnectListener) {
        FileDownloadEventPool.getImpl().removeListener(DownloadServiceConnectChangedEvent.ID, fileDownloadConnectListener);
    }

    public int replaceListener(String str, FileDownloadListener fileDownloadListener) {
        return replaceListener(str, FileDownloadUtils.getDefaultSaveFilePath(str), fileDownloadListener);
    }

    public boolean setMaxNetworkThreadCount(int i) {
        if (FileDownloadList.getImpl().j()) {
            return FileDownloadServiceProxy.getImpl().setMaxNetworkThreadCount(i);
        }
        FileDownloadLog.w(this, "Can't change the max network thread count, because there are actively executing tasks in FileDownloader, please try again after all actively executing tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
        return false;
    }

    public boolean setTaskCompleted(String str, String str2, long j) {
        FileDownloadLog.w(this, "If you invoked this method, please remove it directly feel free, it doesn't need any longer", new Object[0]);
        return true;
    }

    public boolean start(FileDownloadListener fileDownloadListener, boolean z) {
        if (fileDownloadListener != null) {
            return z ? b().startQueueSerial(fileDownloadListener) : b().startQueueParallel(fileDownloadListener);
        }
        FileDownloadLog.w(this, "Tasks with the listener can't start, because the listener provided is null: [null, %B]", Boolean.valueOf(z));
        return false;
    }

    public void startForeground(int i, Notification notification) {
        FileDownloadServiceProxy.getImpl().startForeground(i, notification);
    }

    public void stopForeground(boolean z) {
        FileDownloadServiceProxy.getImpl().stopForeground(z);
    }

    public void unBindService() {
        if (isServiceConnected()) {
            FileDownloadServiceProxy.getImpl().unbindByContext(FileDownloadHelper.getAppContext());
        }
    }

    public boolean unBindServiceIfIdle() {
        if (!isServiceConnected() || !FileDownloadList.getImpl().j() || !FileDownloadServiceProxy.getImpl().isIdle()) {
            return false;
        }
        unBindService();
        return true;
    }

    public byte getStatus(int i, String str) {
        BaseDownloadTask.IRunningTask iRunningTask = FileDownloadList.getImpl().get(i);
        byte status = iRunningTask == null ? FileDownloadServiceProxy.getImpl().getStatus(i) : iRunningTask.getOrigin().getStatus();
        if (str != null && status == 0 && FileDownloadUtils.isFilenameConverted(FileDownloadHelper.getAppContext()) && new File(str).exists()) {
            return (byte) -3;
        }
        return status;
    }

    public int replaceListener(String str, String str2, FileDownloadListener fileDownloadListener) {
        return replaceListener(FileDownloadUtils.generateId(str, str2), fileDownloadListener);
    }

    public boolean setTaskCompleted(List<FileDownloadTaskAtom> list) {
        FileDownloadLog.w(this, "If you invoked this method, please remove it directly feel free, it doesn't need any longer", new Object[0]);
        return true;
    }

    public static void init(Context context, DownloadMgrInitialParams.InitCustomMaker initCustomMaker) {
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(FileDownloader.class, "init Downloader with params: %s %s", context, initCustomMaker);
        }
        if (context != null) {
            FileDownloadHelper.holdContext(context.getApplicationContext());
            CustomComponentHolder.getImpl().setInitCustomMaker(initCustomMaker);
            return;
        }
        throw new IllegalArgumentException("the provided context must not be null!");
    }

    public int replaceListener(int i, FileDownloadListener fileDownloadListener) {
        BaseDownloadTask.IRunningTask iRunningTask = FileDownloadList.getImpl().get(i);
        if (iRunningTask == null) {
            return 0;
        }
        iRunningTask.getOrigin().setListener(fileDownloadListener);
        return iRunningTask.getOrigin().getId();
    }

    public void bindService(Runnable runnable) {
        if (isServiceConnected()) {
            runnable.run();
        } else {
            FileDownloadServiceProxy.getImpl().bindStartByContext(FileDownloadHelper.getAppContext(), runnable);
        }
    }

    public int pause(int i) {
        List<BaseDownloadTask.IRunningTask> listH = FileDownloadList.getImpl().h(i);
        if (listH == null || listH.isEmpty()) {
            FileDownloadLog.w(this, "request pause but not exist %d", Integer.valueOf(i));
            return 0;
        }
        Iterator<BaseDownloadTask.IRunningTask> it2 = listH.iterator();
        while (it2.hasNext()) {
            it2.next().getOrigin().pause();
        }
        return listH.size();
    }
}

package com.huami.watch.companion.facestore.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huami.watch.companion.facestore.database.WactchFacesProvider;
import com.huami.watch.companion.facestore.database.WatchFacesDBContract;
import com.huami.watch.companion.facestore.database.WatchFacesDBHelper;
import com.huami.watch.util.Log;
import com.liulishuo.filedownloader.BaseDownloadTask;
import com.liulishuo.filedownloader.DownloadTask;
import com.liulishuo.filedownloader.FileDownloadConnectListener;
import com.liulishuo.filedownloader.FileDownloadListener;
import com.liulishuo.filedownloader.FileDownloadMonitor;
import com.liulishuo.filedownloader.FileDownloader;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DownloadTaskManager {
    public static final String TAG = "DownloadTaskManager";
    private static DownloadTaskManager g;
    private Context a;
    private final SQLiteDatabase b;
    private FileDownloadListener c;
    private List<DownloadListener> d = new ArrayList();
    private FileDownloadConnectListener e;
    private DataSetObservable f;

    public static class DownloadListener extends FileDownloadListener {
        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void completed(BaseDownloadTask baseDownloadTask) {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void error(BaseDownloadTask baseDownloadTask, Throwable th) {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void paused(BaseDownloadTask baseDownloadTask, int i, int i2) {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void pending(BaseDownloadTask baseDownloadTask, int i, int i2) {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void progress(BaseDownloadTask baseDownloadTask, int i, int i2) {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void warn(BaseDownloadTask baseDownloadTask) {
        }
    }

    public class a extends FileDownloadConnectListener {
        public final /* synthetic */ WeakReference b;

        public a(WeakReference weakReference) {
            this.b = weakReference;
        }

        @Override // com.liulishuo.filedownloader.FileDownloadConnectListener
        public void connected() {
            WeakReference weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            Log.d(DownloadTaskManager.TAG, "connect download service", new Object[0]);
            ((DownloadTaskManager) this.b.get()).postNotifyDataChanged();
        }

        @Override // com.liulishuo.filedownloader.FileDownloadConnectListener
        public void disconnected() {
            WeakReference weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            Log.d(DownloadTaskManager.TAG, "disconnect download service", new Object[0]);
            ((DownloadTaskManager) this.b.get()).postNotifyDataChanged();
        }
    }

    public class b implements FileDownloadMonitor.IMonitor {
        public b() {
        }

        @Override // com.liulishuo.filedownloader.FileDownloadMonitor.IMonitor
        public void onRequestStart(int i, boolean z, FileDownloadListener fileDownloadListener) {
            Log.d(DownloadTaskManager.TAG, "onRequestStart id : " + i + "  listener : " + fileDownloadListener, new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadMonitor.IMonitor
        public void onTaskBegin(BaseDownloadTask baseDownloadTask) {
            Log.d(DownloadTaskManager.TAG, "onTaskBegin filename " + baseDownloadTask.getFilename() + " url " + baseDownloadTask.getUrl(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadMonitor.IMonitor
        public void onTaskOver(BaseDownloadTask baseDownloadTask) {
            Log.d(DownloadTaskManager.TAG, "onTaskStarted filename " + baseDownloadTask.getFilename() + " url " + baseDownloadTask.getUrl(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadMonitor.IMonitor
        public void onTaskStarted(BaseDownloadTask baseDownloadTask) {
            Log.d(DownloadTaskManager.TAG, "onTaskStarted filename " + baseDownloadTask.getFilename() + " url " + baseDownloadTask.getUrl(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadMonitor.IMonitor
        public void onRequestStart(BaseDownloadTask baseDownloadTask) {
            Log.d(DownloadTaskManager.TAG, "onRequestStart filename " + baseDownloadTask.getFilename() + " url " + baseDownloadTask.getUrl(), new Object[0]);
        }
    }

    public class c extends FileDownloadListener {
        private Context a;

        private c(Context context) {
            this.a = context;
        }

        private void a() {
            boolean zHasDownloadingTask = DownloadTaskManager.this.hasDownloadingTask();
            Log.d(DownloadTaskManager.TAG, " hasDownloading :  " + zHasDownloadingTask, new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void completed(BaseDownloadTask baseDownloadTask) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).completed(baseDownloadTask);
            }
            DownloadTaskManager.this.deleteTaskFromTaskManager(baseDownloadTask.getId());
            a();
            Log.d(DownloadTaskManager.TAG, "completed name : " + baseDownloadTask.getFilename(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void error(BaseDownloadTask baseDownloadTask, Throwable th) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).error(baseDownloadTask, th);
            }
            a();
            Log.d(DownloadTaskManager.TAG, "error name : " + baseDownloadTask.getFilename() + th.toString(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void paused(BaseDownloadTask baseDownloadTask, int i, int i2) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).paused(baseDownloadTask, i, i2);
            }
            a();
            Log.d(DownloadTaskManager.TAG, "paused name : " + baseDownloadTask.getFilename(), new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void pending(BaseDownloadTask baseDownloadTask, int i, int i2) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).pending(baseDownloadTask, i, i2);
            }
            Log.d(DownloadTaskManager.TAG, "pending : " + baseDownloadTask.getFilename() + " " + i + "   " + i2, new Object[0]);
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void progress(BaseDownloadTask baseDownloadTask, int i, int i2) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).progress(baseDownloadTask, i, i2);
            }
        }

        @Override // com.liulishuo.filedownloader.FileDownloadListener
        public void warn(BaseDownloadTask baseDownloadTask) {
            Iterator it2 = DownloadTaskManager.this.d.iterator();
            while (it2.hasNext()) {
                ((DownloadListener) it2.next()).warn(baseDownloadTask);
            }
            a();
            Log.d(DownloadTaskManager.TAG, "warn name : " + baseDownloadTask.getFilename(), new Object[0]);
        }
    }

    private DownloadTaskManager(Context context) {
        this.a = context.getApplicationContext();
        b();
        this.f = new DataSetObservable();
        this.b = new WatchFacesDBHelper(this.a).getWritableDatabase();
        FileDownloader.getImpl();
        FileDownloader.setGlobalPost2UIInterval(1000);
        this.c = new c(this.a);
    }

    private void b() {
        if (FileDownloader.getImpl().isServiceConnected()) {
            return;
        }
        FileDownloader.getImpl().bindService();
        h(new WeakReference<>(this));
    }

    private BaseDownloadTask c(DownloadTaskModel downloadTaskModel) {
        DownloadTask downloadTask = (DownloadTask) FileDownloader.getImpl().create(downloadTaskModel.getUrl());
        downloadTask.setPath(downloadTaskModel.getFilePath()).setAutoRetryTimes(3).setListener(this.c).setSyncCallback(true).setCallbackProgressMinInterval(1000).setCallbackProgressTimes(1000);
        return downloadTask;
    }

    public static DownloadTaskModel createTask(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str2)) {
            return null;
        }
        DownloadTaskModel downloadTaskModel = new DownloadTaskModel(FileDownloadUtils.generateId(str3, str4), str, str2, str3, str4, str5, str6, str7);
        Log.d(TAG, "create task name  " + downloadTaskModel, new Object[0]);
        return downloadTaskModel;
    }

    private boolean d(String str) {
        ContentResolver contentResolver = this.a.getContentResolver();
        StringBuilder sb = new StringBuilder();
        sb.append("downloads=");
        sb.append(str);
        return contentResolver.delete(WactchFacesProvider.CONTENT_URI, sb.toString(), null) > 0;
    }

    private int e(String str) {
        int columnIndex;
        Cursor cursorRawQuery = this.b.rawQuery("select download_id from download_task_manager  where downloads=" + str, null);
        if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
            columnIndex = 0;
        } else {
            columnIndex = cursorRawQuery.getColumnIndex("download_id");
            cursorRawQuery.getString(columnIndex);
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return columnIndex;
    }

    private String f(int i) {
        String string = null;
        Cursor cursorRawQuery = this.b.rawQuery("select downloads from download_task_manager  where download_id=" + i, null);
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("downloads"));
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return string;
    }

    private void g() {
        FileDownloadMonitor.setGlobalMonitor(new b());
    }

    public static DownloadTaskManager getInstance(Context context) {
        if (g == null) {
            synchronized (DownloadTaskManager.class) {
                if (g == null) {
                    g = new DownloadTaskManager(context);
                }
            }
        }
        return g;
    }

    private void h(WeakReference<DownloadTaskManager> weakReference) {
        if (this.e != null) {
            FileDownloader.getImpl().removeServiceConnectListener(this.e);
        }
        this.e = new a(weakReference);
        FileDownloader.getImpl().addServiceConnectListener(this.e);
    }

    private void i() {
        FileDownloadMonitor.releaseGlobalMonitor();
    }

    private void j() {
        FileDownloader.getImpl().removeServiceConnectListener(this.e);
        this.e = null;
    }

    public DownloadTaskModel addTask(String str, String str2, String str3, String str4, String str5, String str6) {
        DownloadTaskModel downloadTaskModelCreateTask = createTask(str, str2, str3, str4, str5, str6, null);
        if (addTask(downloadTaskModelCreateTask)) {
            return downloadTaskModelCreateTask;
        }
        return null;
    }

    public boolean couldUpLoadFace(DownloadTaskModel downloadTaskModel) {
        return downloadTaskModel != null && FileDownloader.getImpl().getStatus(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath()) == -3;
    }

    public void deleteAllTask() {
        FileDownloader.getImpl().clearAllTaskData();
        this.b.delete(WatchFacesDBContract.DownloadTaskColumns.TABLE_NAME, null, null);
        this.b.delete(WatchFacesDBContract.FacesTrackColumns.TABLE_NAME, null, null);
    }

    public void deleteDownloadedFile(String str, String str2) {
        deleteFileId(str);
        d(str);
        int iE = e(str);
        deleteTaskFromTaskManager(iE);
        FileDownloader.getImpl().clear(iE, str2);
        new File(str2).delete();
    }

    public boolean deleteFileId(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("downloads=");
        sb.append(str);
        return this.b.delete(WatchFacesDBContract.FacesTrackColumns.TABLE_NAME, sb.toString(), null) > 0;
    }

    public void deleteTask(int i, String str) {
        deleteTask(i, str, false);
    }

    public boolean deleteTaskFromTaskManager(int i) {
        if (this.b.delete(WatchFacesDBContract.DownloadTaskColumns.TABLE_NAME, "download_id =?", new String[]{String.valueOf(i)}) <= 0) {
            return false;
        }
        postNotifyDataChanged();
        return true;
    }

    public int generateDownloadId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        return FileDownloadUtils.generateId(str, str2);
    }

    public List<DownloadTaskModel> getAllTaskModels() {
        ArrayList arrayList = new ArrayList();
        if (!isReady()) {
            return arrayList;
        }
        Cursor cursorRawQuery = this.b.rawQuery("SELECT * FROM download_task_manager", null);
        try {
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return arrayList;
                }
                do {
                    arrayList.add(new DownloadTaskModel(cursorRawQuery));
                } while (cursorRawQuery.moveToNext());
            } catch (Exception e) {
                Log.d(TAG, e.toString(), new Object[0]);
                if (cursorRawQuery != null) {
                }
                return arrayList;
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public List<DownloadTaskModel> getAllTaskModelsWithoutPaused() {
        ArrayList arrayList = new ArrayList();
        if (!isReady()) {
            return arrayList;
        }
        Cursor cursorRawQuery = this.b.rawQuery("SELECT * FROM download_task_manager", null);
        try {
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return arrayList;
                }
                do {
                    DownloadTaskModel downloadTaskModel = new DownloadTaskModel(cursorRawQuery);
                    if (isDownloading(FileDownloader.getImpl().getStatus(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath()))) {
                        arrayList.add(downloadTaskModel);
                    }
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return arrayList;
            } catch (Exception e) {
                Log.d(TAG, e.toString(), new Object[0]);
                if (cursorRawQuery != null) {
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public DownloadTaskModel getModelTask(int i) {
        DownloadTaskModel downloadTaskModel = null;
        if (!isReady()) {
            return null;
        }
        Cursor cursorRawQuery = this.b.rawQuery("SELECT * FROM download_task_manager where download_id = ? ", new String[]{String.valueOf(i)});
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            downloadTaskModel = new DownloadTaskModel(cursorRawQuery);
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return downloadTaskModel;
    }

    public long getSoFar(int i) {
        return FileDownloader.getImpl().getSoFar(i);
    }

    public int getStatus(int i, String str) {
        return FileDownloader.getImpl().getStatus(i, str);
    }

    public long getTotal(int i) {
        return FileDownloader.getImpl().getTotal(i);
    }

    public boolean hasDownloadingTask() {
        boolean zIsDownloading = false;
        if (!isReady()) {
            return false;
        }
        Cursor cursorRawQuery = this.b.rawQuery("SELECT * FROM download_task_manager", null);
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            do {
                DownloadTaskModel downloadTaskModel = new DownloadTaskModel(cursorRawQuery);
                zIsDownloading = isDownloading(FileDownloader.getImpl().getStatus(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath()));
                if (zIsDownloading) {
                    break;
                }
            } while (cursorRawQuery.moveToNext());
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return zIsDownloading;
    }

    public boolean hasDownloadingTaskExclude(int i) {
        boolean zIsDownloading = false;
        if (!isReady()) {
            return false;
        }
        Cursor cursorRawQuery = this.b.rawQuery("SELECT * FROM download_task_manager", null);
        if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
            do {
                DownloadTaskModel downloadTaskModel = new DownloadTaskModel(cursorRawQuery);
                if (downloadTaskModel.getDownloadID() != i && (zIsDownloading = isDownloading(FileDownloader.getImpl().getStatus(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath())))) {
                    break;
                }
            } while (cursorRawQuery.moveToNext());
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return zIsDownloading;
    }

    public boolean isDownloaded(int i) {
        return i == -3;
    }

    public boolean isDownloading(int i) {
        return i >= 0 || i == -1;
    }

    public boolean isReady() {
        return FileDownloader.getImpl().isServiceConnected();
    }

    public void pauseAllTasks() {
        FileDownloader.getImpl().pauseAll();
    }

    public boolean pauseTask(int i) {
        return FileDownloader.getImpl().pause(i) != 0;
    }

    public void postNotifyDataChanged() {
        DataSetObservable dataSetObservable = this.f;
        if (dataSetObservable != null) {
            dataSetObservable.notifyChanged();
        }
    }

    public void registerDownloadListener(DownloadListener downloadListener) {
        this.d.add(downloadListener);
    }

    public void registerDownloadTaskDataObserver(DataSetObserver dataSetObserver) {
        this.f.registerObserver(dataSetObserver);
    }

    public void startAllTaskWithoutPausd() {
        Iterator<DownloadTaskModel> it2 = getAllTaskModelsWithoutPaused().iterator();
        while (it2.hasNext()) {
            c(it2.next()).start();
        }
    }

    public void startAllTasks() {
        List<DownloadTaskModel> allTaskModels = getAllTaskModels();
        if (allTaskModels == null || allTaskModels.size() < 1) {
            Log.d(TAG, " taskModels is empty", new Object[0]);
            return;
        }
        for (DownloadTaskModel downloadTaskModel : allTaskModels) {
            if (downloadTaskModel == null) {
                Log.d(TAG, " taskModels model is null", new Object[0]);
            } else {
                BaseDownloadTask baseDownloadTaskC = c(downloadTaskModel);
                Log.d(TAG, baseDownloadTaskC.getFilename() + "  task start", new Object[0]);
                baseDownloadTaskC.start();
            }
        }
    }

    public boolean startTask(DownloadTaskModel downloadTaskModel) {
        c(downloadTaskModel).start();
        return true;
    }

    public void unregisterDownloadListener(DownloadListener downloadListener) {
        this.d.remove(downloadListener);
    }

    public void unregisterDownloadTaskDataObserver(DataSetObserver dataSetObserver) {
        this.f.unregisterObserver(dataSetObserver);
    }

    public void deleteTask(int i, String str, boolean z) {
        Log.e("zmm", "deleteTask-->" + i + "--->" + str, new Object[0]);
        String strF = f(i);
        deleteFileId(strF);
        d(strF);
        deleteTaskFromTaskManager(i);
        byte status = FileDownloader.getImpl().getStatus(i, str);
        if (z || status != -3) {
            FileDownloader.getImpl().clear(i, str);
            new File(str).delete();
        }
    }

    public boolean addTask(DownloadTaskModel downloadTaskModel) {
        if (downloadTaskModel == null) {
            return false;
        }
        if (FileDownloader.getImpl().getStatus(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath()) == -3) {
            Log.d(TAG, downloadTaskModel.getFilePath() + " has exited ,should not downlaod", new Object[0]);
            return false;
        }
        boolean z = this.b.insert(WatchFacesDBContract.DownloadTaskColumns.TABLE_NAME, null, downloadTaskModel.toContentValues()) != -1;
        Log.d(TAG, downloadTaskModel.getFilePath() + " insert WatchFacesDBContract.DownloadTaskColumns : " + z, new Object[0]);
        postNotifyDataChanged();
        return z;
    }

    public boolean startTask(int i) {
        DownloadTaskModel modelTask = getModelTask(i);
        if (modelTask != null) {
            return startTask(modelTask);
        }
        return false;
    }

    public void startAllTasks(List<DownloadTaskModel> list) {
        if (list == null) {
            return;
        }
        for (DownloadTaskModel downloadTaskModel : list) {
            if (downloadTaskModel == null) {
                Log.d(TAG, "taskModels task is null ", new Object[0]);
            } else {
                c(downloadTaskModel).start();
            }
        }
    }

    public void deleteTask(String str, String str2, boolean z) {
        deleteTask(FileDownloadUtils.generateId(str2, str), str, z);
    }

    public void deleteTask(List<DownloadTaskModel> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTaskModel downloadTaskModel : list) {
            deleteTask(downloadTaskModel.getDownloadID(), downloadTaskModel.getFilePath());
        }
    }
}

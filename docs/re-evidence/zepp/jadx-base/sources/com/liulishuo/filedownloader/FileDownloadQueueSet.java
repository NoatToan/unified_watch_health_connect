package com.liulishuo.filedownloader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadQueueSet {
    private FileDownloadListener a;
    private boolean b;
    private List<BaseDownloadTask.FinishListener> c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Integer h;
    private Integer i;
    private Object j;
    private String k;
    private BaseDownloadTask[] l;

    public FileDownloadQueueSet(FileDownloadListener fileDownloadListener) {
        if (fileDownloadListener == null) {
            throw new IllegalArgumentException("create FileDownloadQueueSet must with valid target!");
        }
        this.a = fileDownloadListener;
    }

    public FileDownloadQueueSet addTaskFinishListener(BaseDownloadTask.FinishListener finishListener) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(finishListener);
        return this;
    }

    public FileDownloadQueueSet disableCallbackProgressTimes() {
        return setCallbackProgressTimes(0);
    }

    public FileDownloadQueueSet downloadSequentially(BaseDownloadTask... baseDownloadTaskArr) {
        this.b = true;
        this.l = baseDownloadTaskArr;
        return this;
    }

    public FileDownloadQueueSet downloadTogether(BaseDownloadTask... baseDownloadTaskArr) {
        this.b = false;
        this.l = baseDownloadTaskArr;
        return this;
    }

    public FileDownloadQueueSet ignoreEachTaskInternalProgress() {
        setCallbackProgressTimes(-1);
        return this;
    }

    public void reuseAndStart() {
        for (BaseDownloadTask baseDownloadTask : this.l) {
            baseDownloadTask.reuse();
        }
        start();
    }

    public FileDownloadQueueSet setAutoRetryTimes(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public FileDownloadQueueSet setCallbackProgressMinInterval(int i) {
        this.i = Integer.valueOf(i);
        return this;
    }

    public FileDownloadQueueSet setCallbackProgressTimes(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public FileDownloadQueueSet setDirectory(String str) {
        this.k = str;
        return this;
    }

    public FileDownloadQueueSet setForceReDownload(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public FileDownloadQueueSet setSyncCallback(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public FileDownloadQueueSet setTag(Object obj) {
        this.j = obj;
        return this;
    }

    public FileDownloadQueueSet setWifiRequired(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public void start() {
        for (BaseDownloadTask baseDownloadTask : this.l) {
            baseDownloadTask.setListener(this.a);
            Integer num = this.d;
            if (num != null) {
                baseDownloadTask.setAutoRetryTimes(num.intValue());
            }
            Boolean bool = this.e;
            if (bool != null) {
                baseDownloadTask.setSyncCallback(bool.booleanValue());
            }
            Boolean bool2 = this.f;
            if (bool2 != null) {
                baseDownloadTask.setForceReDownload(bool2.booleanValue());
            }
            Integer num2 = this.h;
            if (num2 != null) {
                baseDownloadTask.setCallbackProgressTimes(num2.intValue());
            }
            Integer num3 = this.i;
            if (num3 != null) {
                baseDownloadTask.setCallbackProgressMinInterval(num3.intValue());
            }
            Object obj = this.j;
            if (obj != null) {
                baseDownloadTask.setTag(obj);
            }
            List<BaseDownloadTask.FinishListener> list = this.c;
            if (list != null) {
                Iterator<BaseDownloadTask.FinishListener> it2 = list.iterator();
                while (it2.hasNext()) {
                    baseDownloadTask.addFinishListener(it2.next());
                }
            }
            String str = this.k;
            if (str != null) {
                baseDownloadTask.setPath(str, true);
            }
            Boolean bool3 = this.g;
            if (bool3 != null) {
                baseDownloadTask.setWifiRequired(bool3.booleanValue());
            }
            baseDownloadTask.asInQueueTask().enqueue();
        }
        FileDownloader.getImpl().start(this.a, this.b);
    }

    public FileDownloadQueueSet downloadSequentially(List<BaseDownloadTask> list) {
        this.b = true;
        BaseDownloadTask[] baseDownloadTaskArr = new BaseDownloadTask[list.size()];
        this.l = baseDownloadTaskArr;
        list.toArray(baseDownloadTaskArr);
        return this;
    }

    public FileDownloadQueueSet downloadTogether(List<BaseDownloadTask> list) {
        this.b = false;
        BaseDownloadTask[] baseDownloadTaskArr = new BaseDownloadTask[list.size()];
        this.l = baseDownloadTaskArr;
        list.toArray(baseDownloadTaskArr);
        return this;
    }
}

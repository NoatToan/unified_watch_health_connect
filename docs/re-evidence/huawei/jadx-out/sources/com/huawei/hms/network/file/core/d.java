package com.huawei.hms.network.file.core;

import com.huawei.hms.network.file.api.Callback;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.api.IRequestManager;
import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.core.task.i;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class d<R extends Request> implements IRequestManager<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Set<Long> f15739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.huawei.hms.network.file.core.task.c f15740c;
    f e;
    GlobalRequestConfig f;
    volatile boolean g;
    volatile boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ConcurrentHashMap<Long, i> f15738a = new ConcurrentHashMap<>();
    Result d = Result.RESULT_SUCCESS;

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public Result start(R r, Callback callback) {
        synchronized (this) {
            try {
                if (r == null) {
                    return new Result(Constants.ErrorCode.REQUEST_NULL);
                }
                if (!this.f15738a.containsKey(Long.valueOf(r.getId())) && !b(r.getId())) {
                    i iVar = new i(r, this.f15740c, callback, this, this.e);
                    Result resultK = iVar.k();
                    if (resultK.getCode() == Constants.ErrorCode.SUCCESS.getErrorCode()) {
                        this.f15738a.put(Long.valueOf(r.getId()), iVar);
                        a(Long.valueOf(r.getId()));
                    }
                    return resultK;
                }
                FLogger.i("RequestManagerCore", "start will resume the request in DB:" + r.getId(), new Object[0]);
                return a(r, callback);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public Result.STATUS getRequestStatus(long j) {
        synchronized (this) {
            if (this.f15738a.containsKey(Long.valueOf(j))) {
                return Utils.getMapedStatus(this.f15738a.get(Long.valueOf(j)).d());
            }
            e<R> eVarC = this.f15740c.c(j);
            if (eVarC == null) {
                return Result.STATUS.INVALID;
            }
            if (eVarC.b() == com.huawei.hms.network.file.core.task.e.a.PROCESS.ordinal()) {
                return Result.STATUS.PAUSE;
            }
            return Utils.getMapedStatus(com.huawei.hms.network.file.core.task.e.a.values()[eVarC.b()]);
        }
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public R getRequest(long j) {
        synchronized (this) {
            if (this.f15738a.containsKey(Long.valueOf(j))) {
                return (R) this.f15738a.get(Long.valueOf(j)).c();
            }
            e<R> eVarC = this.f15740c.c(j);
            if (eVarC == null) {
                return null;
            }
            return (R) eVarC.a();
        }
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public List<R> getAllRequests() {
        synchronized (this) {
            List<R> listA = this.f15740c.a(true);
            if (listA != null && listA.size() > 0) {
                return listA;
            }
            Collection<i> collectionValues = this.f15738a.values();
            if (collectionValues.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<i> it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c());
            }
            return arrayList;
        }
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public Result destoryRequests() {
        Result result;
        synchronized (this) {
            List<R> listA = this.f15740c.a(false);
            if (!Utils.isEmpty(listA)) {
                Iterator<R> it = listA.iterator();
                while (it.hasNext()) {
                    cancelRequest(it.next().getId());
                }
            }
            result = this.d;
        }
        return result;
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public Result closeThreadPools() {
        Result result;
        synchronized (this) {
            this.e.e();
            result = this.d;
        }
        return result;
    }

    @Override // com.huawei.hms.network.file.api.IRequestManager
    public Result cancelRequest(long j) {
        synchronized (this) {
            Result result = this.d;
            if (this.f15738a.containsKey(Long.valueOf(j))) {
                Result resultA = this.f15738a.get(Long.valueOf(j)).a();
                if (resultA.getCode() == Result.SUCCESS) {
                    this.f15738a.remove(Long.valueOf(j));
                }
                return resultA;
            }
            if (b(j)) {
                this.f15740c.a(j);
                return result;
            }
            return new Result(Constants.ErrorCode.REQUEST_NO_EXIST);
        }
    }

    public void a(com.huawei.hms.network.file.core.task.c cVar) {
        this.f15740c = cVar;
        this.f15739b = Collections.synchronizedSet(new HashSet());
        if (cVar != null) {
            f.f().execute(new Runnable() { // from class: com.huawei.hms.network.file.core.d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b();
                }
            });
        }
    }

    public void a(Request request) {
        synchronized (this) {
            if (request != null) {
                if (this.f15738a.containsKey(Long.valueOf(request.getId()))) {
                    this.f15738a.remove(Long.valueOf(request.getId()));
                }
            }
        }
    }

    public Result a(R r, Callback callback) {
        boolean z;
        i iVar;
        synchronized (this) {
            try {
                if (r == null) {
                    return new Result(Constants.ErrorCode.REQUEST_NULL);
                }
                long id = r.getId();
                if (this.f15738a.containsKey(Long.valueOf(id))) {
                    iVar = this.f15738a.get(Long.valueOf(id));
                    if (iVar.d() != com.huawei.hms.network.file.core.task.e.a.PAUSE) {
                        return new Result(Constants.ErrorCode.REQUEST_STATUS_ERROR);
                    }
                    z = false;
                } else {
                    if (!b(id)) {
                        return new Result(Constants.ErrorCode.REQUEST_NO_EXIST);
                    }
                    e<R> eVarC = this.f15740c.c(id);
                    if (eVarC == null) {
                        return new Result(Constants.ErrorCode.REQUEST_NO_EXIST);
                    }
                    a(Long.valueOf(r.getId()));
                    if (eVarC.b() > com.huawei.hms.network.file.core.task.e.a.PAUSE.ordinal()) {
                        return new Result(Constants.ErrorCode.REQUEST_STATUS_ERROR);
                    }
                    i iVar2 = new i(r, this.f15740c, callback, this, this.e);
                    this.f15738a.put(Long.valueOf(r.getId()), iVar2);
                    z = true;
                    iVar = iVar2;
                }
                iVar.a(r, callback, z);
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Result a(long j) {
        synchronized (this) {
            Constants.ErrorCode errorCodeC = c(j);
            if (errorCodeC != Constants.ErrorCode.SUCCESS) {
                return new Result(errorCodeC);
            }
            return this.f15738a.get(Long.valueOf(j)).i();
        }
    }

    public GlobalRequestConfig a() {
        return this.f;
    }

    private Constants.ErrorCode c(long j) {
        Constants.ErrorCode errorCode = Constants.ErrorCode.SUCCESS;
        if (this.f15738a.containsKey(Long.valueOf(j))) {
            return this.f15738a.get(Long.valueOf(j)).d() != com.huawei.hms.network.file.core.task.e.a.PROCESS ? Constants.ErrorCode.REQUEST_STATUS_ERROR : errorCode;
        }
        return Constants.ErrorCode.REQUEST_NO_EXIST;
    }

    private boolean b(long j) {
        if (this.g && this.f15739b.contains(Long.valueOf(j))) {
            return true;
        }
        if (this.h) {
            return false;
        }
        FLogger.i("RequestManagerCore", "isIdExistInCache get request in db", new Object[0]);
        return this.f15740c.c(j) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        FLogger.i("RequestManagerCore", "start getCachedRequestID async", new Object[0]);
        Set<Long> setA = this.f15740c.a(100);
        if (!Utils.isEmpty(setA)) {
            Iterator<Long> it = setA.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
        this.g = true;
        if (this.f15739b.size() < 100) {
            this.h = true;
        }
        FLogger.i("RequestManagerCore", "get db data success for count:" + this.f15739b.size() + "/100; isGetCacheComplete:" + this.h, new Object[0]);
    }

    private void a(Long l) {
        this.f15739b.add(l);
    }

    public d(GlobalRequestConfig globalRequestConfig) {
        this.e = new f(globalRequestConfig);
        this.f = globalRequestConfig;
        FLogger.i("RequestManagerCore", "RequestManagerCore fileManager version:8.0.1.320", new Object[0]);
    }
}

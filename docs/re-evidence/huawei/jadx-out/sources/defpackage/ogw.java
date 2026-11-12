package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.MemoryFile;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.ohos.localability.FormCallback;
import com.huawei.ohos.localability.FormException;
import com.huawei.ohos.localability.ListenerType;
import com.huawei.ohos.localability.VisibilityChangeNotify;
import com.huawei.ohos.localability.a;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ogw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ogw f44295a = new ogw();
    private volatile c e;
    private final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f44296b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile IBinder f44297c = null;
    private Map<Context, FormCallback> f = new HashMap();
    private Map<String, e> h = new HashMap();
    private final IBinder.DeathRecipient i = new d();

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ListenerType listenerType, List<String> list, List<ohb> list2) {
        synchronized (this.d) {
            String str = listenerType + "_" + String.join("_", list);
            e eVar = this.h.get(str);
            if (eVar == null) {
                Log.e("AbilityFormSupplyProxy", "visibility change notify info is null: " + str);
            } else {
                VisibilityChangeNotify visibilityChangeNotify = eVar.e;
                if (visibilityChangeNotify != null) {
                    Log.i("AbilityFormSupplyProxy", "onVisibilityChange: " + str);
                    visibilityChangeNotify.onVisibilityChange(list2);
                }
            }
        }
    }

    public boolean b(long j, Context context, ogz ogzVar) throws FormException {
        if (j <= 0 || context == null || ogzVar == null) {
            Log.e("AbilityFormSupplyProxy", "updateForm param is not correct");
            throw new FormException(FormException.FormError.INPUT_PARAM_INVALID, "updateForm param is not correct");
        }
        if (this.f44296b != 2) {
            Log.i("AbilityFormSupplyProxy", "update form " + j + " come from " + context.getPackageName());
            IBinder iBinderE = e();
            if (iBinderE == null) {
                Log.e("AbilityFormSupplyProxy", "updateForm, getFmsProxy return null");
                throw new FormException(FormException.FormError.FMS_RPC_ERROR);
            }
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("OHOS.AppExecFwk.IFormMgr");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(context.getPackageName());
                    if (Build.VERSION.SDK_INT >= 29) {
                        parcelObtain.writeBoolean(true);
                    } else {
                        parcelObtain.writeInt(1);
                    }
                    if (!b(parcelObtain, ogzVar)) {
                        throw new FormException(FormException.FormError.INTERNAL_ERROR, "write js form data internal error");
                    }
                    iBinderE.transact(26, parcelObtain, parcelObtain2, 0);
                    int i = parcelObtain2.readInt();
                    if (i == 0) {
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        return true;
                    }
                    FormException.FormError formErrorD = d(i);
                    Log.e("AbilityFormSupplyProxy", "updateForm error, error code " + formErrorD);
                    throw new FormException(formErrorD);
                } catch (RemoteException unused) {
                    throw new FormException(FormException.FormError.SEND_FMS_MSG_ERROR, "form request transact occurs");
                }
            } catch (Throwable th) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th;
            }
        }
        Log.e("AbilityFormSupplyProxy", "fms is starting");
        throw new FormException(FormException.FormError.FORM_IN_RECOVER);
    }

    public void e(Context context, FormCallback formCallback) throws FormException {
        Log.i("AbilityFormSupplyProxy", "registerFormsVisibleNotifier come from aar");
        if (context == null || formCallback == null) {
            Log.e("AbilityFormSupplyProxy", "registerFormsVisibleNotifier param is not correct");
            throw new FormException(FormException.FormError.INPUT_PARAM_INVALID, "registerFormsVisibleNotifier param is not correct");
        }
        if (this.f44296b == 2) {
            Log.e("AbilityFormSupplyProxy", "fms is starting");
            throw new FormException(FormException.FormError.FORM_IN_RECOVER);
        }
        synchronized (this.d) {
            if (this.f.get(context) != null) {
                Log.w("AbilityFormSupplyProxy", "has already register");
            } else {
                this.f.put(context, formCallback);
                a(context, formCallback, true);
            }
        }
    }

    public void b(Context context) throws FormException {
        Log.i("AbilityFormSupplyProxy", "unregisterFormsVisibleNotifier come from aar");
        if (context == null) {
            Log.e("AbilityFormSupplyProxy", "unregisterFormsVisibleNotifier param is not correct");
            throw new FormException(FormException.FormError.INPUT_PARAM_INVALID, "unregisterFormsVisibleNotifier param is not correct");
        }
        if (this.f44296b == 2) {
            Log.e("AbilityFormSupplyProxy", "fms is starting");
            throw new FormException(FormException.FormError.FORM_IN_RECOVER);
        }
        synchronized (this.d) {
            if (this.f.get(context) == null) {
                Log.w("AbilityFormSupplyProxy", "has not register yet");
            } else {
                this.f.remove(context);
                a(context, null, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e2) {
                Log.e("AbilityFormSupplyProxy", "reconnect, InterruptedException exception " + e2.getMessage());
            }
            if (e() == null) {
                Log.w("AbilityFormSupplyProxy", "get fms proxy fail, try again");
            } else {
                Log.i("AbilityFormSupplyProxy", "get bms and fms proxy success");
                return true;
            }
        }
        return false;
    }

    public static ogw b() {
        return f44295a;
    }

    private IBinder e() {
        if (this.f44297c != null) {
            return this.f44297c;
        }
        IBinder iBinderC = oha.c();
        if (iBinderC == null) {
            return iBinderC;
        }
        this.f44297c = iBinderC;
        try {
            this.f44297c.linkToDeath(this.i, 0);
        } catch (RemoteException e2) {
            Log.e("AbilityFormSupplyProxy", "fms proxy link to death error " + e2.getMessage());
            this.f44297c = null;
        }
        return this.f44297c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(ListenerType listenerType, List<String> list, VisibilityChangeNotify visibilityChangeNotify, boolean z) {
        synchronized (this) {
            Log.i("AbilityFormSupplyProxy", "enableVisibilityChangeNotify come from aar, listenerType is " + listenerType + ", hostBundleNames is " + list + ", enable flag is " + z);
            IBinder iBinderE = e();
            if (iBinderE == null) {
                Log.e("AbilityFormSupplyProxy", "enableVisibilityChangeNotify, getFmsProxy return null");
                return false;
            }
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("OHOS.AppExecFwk.IFormMgr");
                    parcelObtain.writeInt(listenerType.getValue());
                    parcelObtain.writeInt(list.size());
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        parcelObtain.writeString(it.next());
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        parcelObtain.writeBoolean(z);
                    } else {
                        parcelObtain.writeInt(z ? 1 : 0);
                    }
                    parcelObtain.writeStrongBinder(d().asBinder());
                    iBinderE.transact(37, parcelObtain, parcelObtain2, 0);
                    if (parcelObtain2.dataAvail() == 0) {
                        Log.e("AbilityFormSupplyProxy", "enableVisibilityChangeNotify, method does not exist");
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        return false;
                    }
                    int i = parcelObtain2.readInt();
                    if (i != 0) {
                        Log.e("AbilityFormSupplyProxy", "handle form visible change notify error, error code " + i);
                        parcelObtain.recycle();
                        parcelObtain2.recycle();
                        return false;
                    }
                    String str = listenerType + "_" + String.join("_", list);
                    if (z) {
                        this.h.put(str, new e(listenerType, list, visibilityChangeNotify));
                    } else {
                        this.h.remove(str);
                    }
                    Log.i("AbilityFormSupplyProxy", "enableVisibilityChangeNotify success");
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    return true;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    throw th;
                }
            } catch (RemoteException e2) {
                Log.e("AbilityFormSupplyProxy", "handle enableVisibilityChangeNotify transact occurs exception:" + e2.getMessage());
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return false;
            }
        }
    }

    private boolean b(Parcel parcel, ogz ogzVar) throws Throwable {
        MemoryFile memoryFile;
        parcel.writeString(ogzVar.e());
        parcel.writeInt(ogzVar.d());
        for (Map.Entry<String, byte[]> entry : ogzVar.c().entrySet()) {
            MemoryFile memoryFile2 = null;
            try {
                try {
                    try {
                        String key = entry.getKey();
                        byte[] value = entry.getValue();
                        if (key != null && value != null) {
                            memoryFile = new MemoryFile(key, value.length);
                            try {
                                try {
                                    memoryFile.writeBytes(value, 0, 0, value.length);
                                    Object objInvoke = memoryFile.getClass().getDeclaredMethod("getFileDescriptor", new Class[0]).invoke(memoryFile, new Object[0]);
                                    if (!(objInvoke instanceof FileDescriptor)) {
                                        Log.e("AbilityFormSupplyProxy", "FileDescriptor type error");
                                        memoryFile.close();
                                        return false;
                                    }
                                    parcel.writeString(key);
                                    parcel.writeInt(value.length);
                                    parcel.writeFileDescriptor((FileDescriptor) objInvoke);
                                    memoryFile.close();
                                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                                    memoryFile2 = memoryFile;
                                    Log.e("AbilityFormSupplyProxy", "writeJsFormBindingData get fd error occurs");
                                    if (memoryFile2 != null) {
                                        memoryFile2.close();
                                    }
                                    return false;
                                }
                            } catch (IOException unused2) {
                                memoryFile2 = memoryFile;
                                Log.e("AbilityFormSupplyProxy", "writeJsFormBindingData IOException occurs");
                                if (memoryFile2 != null) {
                                    memoryFile2.close();
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                if (memoryFile != null) {
                                    memoryFile.close();
                                }
                                throw th;
                            }
                        }
                        Log.e("AbilityFormSupplyProxy", "JsFormBindingData is null");
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        memoryFile = null;
                    }
                } catch (IOException unused3) {
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused4) {
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Long> list) {
        if (list == null) {
            Log.e("AbilityFormSupplyProxy", "processFormVisible form failed, no form id");
            return;
        }
        synchronized (this.d) {
            Iterator<FormCallback> it = this.f.values().iterator();
            while (it.hasNext()) {
                it.next().onFormsVisible(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, FormCallback formCallback, boolean z) throws FormException {
        Log.i("AbilityFormSupplyProxy", "enableFormsVisibleNotifierOrNot come from aar");
        IBinder iBinderE = e();
        if (iBinderE == null) {
            Log.e("AbilityFormSupplyProxy", "enableFormsVisibleNotifierOrNot, getFmsProxy return null");
            throw new FormException(FormException.FormError.FMS_RPC_ERROR);
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken("OHOS.AppExecFwk.IFormMgr");
                parcelObtain.writeString(context.getPackageName());
                if (Build.VERSION.SDK_INT >= 29) {
                    parcelObtain.writeBoolean(z);
                } else {
                    parcelObtain.writeInt(z ? 1 : 0);
                }
                if (formCallback != null) {
                    parcelObtain.writeStrongBinder(d().asBinder());
                }
                iBinderE.transact(27, parcelObtain, parcelObtain2, 0);
                int i = parcelObtain2.readInt();
                if (i == 0) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                } else {
                    FormException.FormError formErrorD = d(i);
                    Log.e("AbilityFormSupplyProxy", "handle form visible notify error, error code " + formErrorD);
                    throw new FormException(formErrorD);
                }
            } catch (RemoteException e2) {
                Log.e("AbilityFormSupplyProxy", "handleFormsVisibleNotifier transact occurs exception:" + e2.getMessage());
                throw new FormException(FormException.FormError.SEND_FMS_MSG_ERROR, "handle forms visible transact occurs exception:" + e2.getMessage());
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            throw th;
        }
    }

    private FormException.FormError d(int i) {
        FormException.FormError formErrorA = FormException.FormError.a(i);
        if (formErrorA != null) {
            return formErrorA;
        }
        FormException.FormError formError = FormException.FormError.INTERNAL_ERROR;
        Log.e("AbilityFormSupplyProxy", "cannot get specific error, use default " + formError);
        return formError;
    }

    private c d() {
        c cVar;
        synchronized (this) {
            if (this.e == null) {
                this.e = new c(this, this);
            }
            cVar = this.e;
        }
        return cVar;
    }

    public class c extends a.AbstractBinderC0194a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<ogw> f44298c;

        public c(ogw ogwVar, ogw ogwVar2) {
            this.f44298c = new WeakReference<>(ogwVar2);
        }
    }

    class d implements IBinder.DeathRecipient {
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (ogw.this.d) {
                while (ogw.this.f44296b == 2) {
                    try {
                        Log.e("AbilityFormSupplyProxy", "remote died, wait for previous recover finish");
                        ogw.this.d.wait();
                    } catch (InterruptedException e) {
                        Log.e("AbilityFormSupplyProxy", "wait lock occurs interrupted exception " + e);
                    }
                }
                ogw.this.f44296b = 2;
                if (ogw.this.f44297c != null) {
                    ogw.this.f44297c.unlinkToDeath(ogw.this.i, 0);
                    ogw.this.f44297c = null;
                }
            }
            try {
                if (!ogw.this.a()) {
                    Log.e("AbilityFormSupplyProxy", "binderDied, try to reconnect to bms and fms failed");
                    synchronized (ogw.this.d) {
                        ogw.this.f44296b = 1;
                        ogw.this.d.notifyAll();
                    }
                    return;
                }
                try {
                    synchronized (ogw.this.d) {
                        try {
                            for (Context context : ogw.this.f.keySet()) {
                                ogw ogwVar = ogw.this;
                                ogwVar.a(context, (FormCallback) ogwVar.f.get(context), true);
                            }
                            Iterator it = ogw.this.h.keySet().iterator();
                            while (it.hasNext()) {
                                e eVar = (e) ogw.this.h.get((String) it.next());
                                ogw.this.c(eVar.f44300c, eVar.d, eVar.e, true);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    synchronized (ogw.this.d) {
                        ogw.this.f44296b = 0;
                        ogw.this.d.notifyAll();
                    }
                } catch (FormException unused) {
                    Log.e("AbilityFormSupplyProxy", "retry register form visible fail");
                    synchronized (ogw.this.d) {
                        ogw.this.f44296b = 0;
                        ogw.this.d.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                synchronized (ogw.this.d) {
                    ogw.this.f44296b = 0;
                    ogw.this.d.notifyAll();
                    throw th2;
                }
            }
        }

        d() {
        }
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ListenerType f44300c;
        List<String> d;
        VisibilityChangeNotify e;

        e(ListenerType listenerType, List<String> list, VisibilityChangeNotify visibilityChangeNotify) {
            this.f44300c = listenerType;
            this.d = list;
            this.e = visibilityChangeNotify;
        }
    }

    private ogw() {
    }
}

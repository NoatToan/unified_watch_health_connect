package com.huawei.hmf.orb;

import com.huawei.hmf.annotation.NamedMethod;
import com.huawei.hmf.orb.aidl.NamingRemoteProxy;
import com.huawei.hmf.orb.aidl.request.InvokeService;
import com.huawei.hmf.orb.aidl.request.TypeKind;
import com.huawei.hmf.orb.bridge.Bridge;
import com.huawei.hmf.orb.bridge.RemoteBridgeFactory;
import com.huawei.hmf.orb.exception.InvocationException;
import com.huawei.hmf.services.codec.TypeToken;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes33.dex */
public class RemoteProxy {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    private RemoteInvoker mRemote;
    private long mSequence = -1;

    public RemoteProxy(RemoteInvoker remoteInvoker) {
        this.mRemote = remoteInvoker;
    }

    protected void setSequence(long j) {
        this.mSequence = j;
    }

    protected Object send(String str, String str2, TypeToken typeToken, Object... objArr) {
        Class rawType;
        Bridge bridge;
        if (typeToken != null && (rawType = typeToken.getRawType()) != null && (bridge = RemoteBridgeFactory.getBridge(rawType)) != null) {
            return bridge.send(this.mRemote, this.mRemote.post(str, str2, assemblyArgument(objArr)), typeToken);
        }
        Class rawType2 = typeToken != null ? typeToken.getRawType() : null;
        TypeKind typeKind = TypeKind.CLASS;
        if (rawType2 != null && rawType2.isInterface()) {
            for (Method method : rawType2.getMethods()) {
                if (method.getAnnotation(NamedMethod.class) != null) {
                    typeKind = TypeKind.NamedClass;
                    break;
                }
            }
        }
        InvokeService.Response responseSend = this.mRemote.send(str, str2, typeKind, assemblyArgument(objArr));
        if (typeToken == null) {
            return null;
        }
        if (responseSend == null) {
            throw new InvocationException("Unexpected null value returned.");
        }
        if (!responseSend.isSuccessful()) {
            throw new InvocationException("Invoke failed, error code " + (responseSend.ret == null ? "unknown" : responseSend.ret.cast(Integer.TYPE)));
        }
        if (typeKind == TypeKind.NamedClass) {
            Long l = (Long) responseSend.ret.cast(Long.class);
            l.longValue();
            return NamingRemoteProxy.create(this.mRemote, (Class<?>[]) new Class[]{typeToken.getRawType()}, l);
        }
        return responseSend.ret.cast(typeToken.getType());
    }

    private Object[] assemblyArgument(Object[] objArr) {
        if (objArr == null) {
            objArr = EMPTY_ARRAY;
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = Long.valueOf(this.mSequence);
        if (objArr.length > 0) {
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        }
        return objArr2;
    }
}

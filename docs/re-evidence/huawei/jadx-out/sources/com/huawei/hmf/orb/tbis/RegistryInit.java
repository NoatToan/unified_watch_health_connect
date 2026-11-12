package com.huawei.hmf.orb.tbis;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hmf.orb.tbis.type.BundleRef;
import com.huawei.hmf.orb.tbis.type.IntentRef;
import com.huawei.hmf.orb.tbis.type.ObjectRef;
import com.huawei.hmf.orb.tbis.type.TaskRef;
import com.huawei.hmf.orb.tbis.type.TaskStreamRef;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.taskstream.TaskStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
class RegistryInit {
    public static void init() {
    }

    RegistryInit() {
    }

    static {
        TBNativeType.registry(Task.class, null, new TBNativeType.Factory<TaskRef, Task>() { // from class: com.huawei.hmf.orb.tbis.RegistryInit.1
            @Override // com.huawei.hmf.orb.tbis.TBNativeType.Factory
            public TaskRef create(Task task) {
                return new TaskRef(task);
            }
        });
        TBNativeType.registry(TaskStream.class, null, new TBNativeType.Factory<TaskStreamRef, TaskStream>() { // from class: com.huawei.hmf.orb.tbis.RegistryInit.2
            @Override // com.huawei.hmf.orb.tbis.TBNativeType.Factory
            public TaskStreamRef create(TaskStream taskStream) {
                return new TaskStreamRef(taskStream);
            }
        });
        TBNativeType.registry(Intent.class, TBNativeType.newUnBoxedFactory(IntentRef.class), new TBNativeType.Factory<IntentRef, Intent>() { // from class: com.huawei.hmf.orb.tbis.RegistryInit.3
            @Override // com.huawei.hmf.orb.tbis.TBNativeType.Factory
            public IntentRef create(Intent intent) {
                return new IntentRef(intent);
            }
        });
        TBNativeType.registry(Bundle.class, TBNativeType.newUnBoxedFactory(BundleRef.class), new TBNativeType.Factory<BundleRef, Bundle>() { // from class: com.huawei.hmf.orb.tbis.RegistryInit.4
            @Override // com.huawei.hmf.orb.tbis.TBNativeType.Factory
            public BundleRef create(Bundle bundle) {
                return new BundleRef(bundle);
            }
        });
        TBNativeType.registry(Context.class, ObjectRef.UnBoxedFactory, ObjectRef.BoxedFactory);
        TBNativeType.registry(List.class, null, new StringFactory());
        TBNativeType.registry(Map.class, null, new StringFactory());
    }

    public static class StringFactory<T> implements TBNativeType.Factory<String, T> {
        @Override // com.huawei.hmf.orb.tbis.TBNativeType.Factory
        public String create(T t) {
            return TextCodecFactory.create().toString(t);
        }
    }
}

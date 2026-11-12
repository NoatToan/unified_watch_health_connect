package com.huami.userproperty.usecase;

import com.huami.tools.log.HMLog;
import com.huami.userproperty.service.entity.local.LastSyncProperty;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/userproperty/usecase/DumpAllLocalDataUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "a", "Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "getAllLocalPropertiesUseCase", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "lastSyncValuePersistence", "<init>", "(Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;Lcom/huami/utils/persistence/kvkit/KvPersistence;)V", "Companion", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class DumpAllLocalDataUseCase {

    @NotNull
    private static final String c = "DumpAllLocalDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetAllLocalPropertiesUseCase getAllLocalPropertiesUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence lastSyncValuePersistence;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.element;
        }
    }

    public DumpAllLocalDataUseCase(@NotNull GetAllLocalPropertiesUseCase getAllLocalPropertiesUseCase, @NotNull KvPersistence kvPersistence) {
        this.getAllLocalPropertiesUseCase = getAllLocalPropertiesUseCase;
        this.lastSyncValuePersistence = kvPersistence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.String] */
    public final void execute() {
        int i;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "\n打印所有 UserProperty 数据：\n";
        objectRef.element = Intrinsics.stringPlus("\n打印所有 UserProperty 数据：\n", "--- local prop (default api) ---\n");
        List<LocalProperty> listExecute = this.getAllLocalPropertiesUseCase.execute();
        ArrayList<LocalProperty> arrayList = new ArrayList();
        Iterator<T> it2 = listExecute.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((LocalProperty) next).getApi() == null) {
                arrayList.add(next);
            }
        }
        for (LocalProperty localProperty : arrayList) {
            objectRef.element = ((String) objectRef.element) + "key: " + localProperty.getKey() + '\n';
            objectRef.element = ((String) objectRef.element) + "value: " + ((Object) localProperty.getValue()) + '\n';
        }
        objectRef.element = Intrinsics.stringPlus((String) objectRef.element, "--- local prop (custom api) ---\n");
        ArrayList<LocalProperty> arrayList2 = new ArrayList();
        for (Object obj : listExecute) {
            if (((LocalProperty) obj).getApi() != null) {
                arrayList2.add(obj);
            }
        }
        for (LocalProperty localProperty2 : arrayList2) {
            objectRef.element = ((String) objectRef.element) + "key: " + localProperty2.getKey() + '\n';
            objectRef.element = ((String) objectRef.element) + "api: " + ((Object) localProperty2.getApi()) + '\n';
            objectRef.element = ((String) objectRef.element) + "value: " + ((Object) localProperty2.getValue()) + '\n';
        }
        objectRef.element = Intrinsics.stringPlus((String) objectRef.element, "--- last sync (all) ---\n");
        new LastSyncProperty("", null, null);
        String[] allKeys = this.lastSyncValuePersistence.getAllKeys();
        ArrayList<LastSyncProperty> arrayList3 = new ArrayList();
        for (String str : allKeys) {
            LastSyncProperty lastSyncProperty = (LastSyncProperty) this.lastSyncValuePersistence.getParcelableValue(str, LastSyncProperty.class);
            if (lastSyncProperty != null) {
                arrayList3.add(lastSyncProperty);
            }
        }
        for (LastSyncProperty lastSyncProperty2 : arrayList3) {
            objectRef.element = ((String) objectRef.element) + "key: " + lastSyncProperty2.getKey() + '\n';
            objectRef.element = ((String) objectRef.element) + "api: " + ((Object) lastSyncProperty2.getApi()) + '\n';
            objectRef.element = ((String) objectRef.element) + "value: " + ((Object) lastSyncProperty2.getValue()) + '\n';
        }
        HMLog.verbose(c, new a(objectRef));
    }
}

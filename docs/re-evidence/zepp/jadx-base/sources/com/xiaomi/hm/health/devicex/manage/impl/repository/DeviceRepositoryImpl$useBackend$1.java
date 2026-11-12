package com.xiaomi.hm.health.devicex.manage.impl.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"K", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DeviceRepositoryImpl$useBackend$1 extends Lambda implements Function0<String> {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceRepositoryImpl$useBackend$1(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        return "call method --> " + this.a + " begin ";
    }
}

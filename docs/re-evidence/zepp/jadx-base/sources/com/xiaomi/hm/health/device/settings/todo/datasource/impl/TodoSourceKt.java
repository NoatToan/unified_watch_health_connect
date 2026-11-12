package com.xiaomi.hm.health.device.settings.todo.datasource.impl;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "toTodoSource", "toInt", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class TodoSourceKt {
    public static final int toInt(@NotNull Todo.Source source) {
        if (Intrinsics.areEqual(source, Todo.Source.Default.INSTANCE)) {
            return 0;
        }
        if (Intrinsics.areEqual(source, Todo.Source.XiaoAi.INSTANCE)) {
            return 1;
        }
        if (Intrinsics.areEqual(source, Todo.Source.Alexa.INSTANCE)) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Todo.Source toTodoSource(int i) {
        if (i != 1) {
            return i != 2 ? Todo.Source.Default.INSTANCE : Todo.Source.Alexa.INSTANCE;
        }
        return Todo.Source.XiaoAi.INSTANCE;
    }
}

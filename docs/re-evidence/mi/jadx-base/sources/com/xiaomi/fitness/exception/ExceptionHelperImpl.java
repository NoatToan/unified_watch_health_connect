package com.xiaomi.fitness.exception;

import com.google.gson.Gson;
import com.xiaomi.fitness.exception.export.ExceptionHelper;
import defpackage.cul;
import io.sentry.SentryLevel;
import io.sentry.a;
import io.sentry.protocol.h;
import io.sentry.s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0016J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016J$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/exception/ExceptionHelperImpl;", "Lcom/xiaomi/fitness/exception/export/ExceptionHelper;", "<init>", "()V", "uploadEvent", "", "tags", "", "", "level", "Lio/sentry/SentryLevel;", "params", "", "", "message", "addBreadcrumb", "exception_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExceptionHelperImpl implements ExceptionHelper {
    @Override // com.xiaomi.fitness.exception.export.ExceptionHelper
    public void addBreadcrumb(@NotNull SentryLevel level, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            a aVar = new a();
            aVar.p(new Gson().toJson(params));
            aVar.o(level);
            cul.e(aVar);
        } catch (Exception unused) {
        }
    }

    @Override // com.xiaomi.fitness.exception.export.ExceptionHelper
    public void uploadEvent(@NotNull List<String> tags, @NotNull SentryLevel level, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(params);
            linkedHashMap.put("tags", tags);
            String json = new Gson().toJson(linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            uploadEvent(tags, level, json);
        } catch (Exception unused) {
        }
    }

    @Override // com.xiaomi.fitness.exception.export.ExceptionHelper
    public void uploadEvent(@NotNull List<String> tags, @NotNull SentryLevel level, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            h hVar = new h();
            hVar.e("tags:[" + CollectionsKt___CollectionsKt.joinToString$default(tags, ",", null, null, 0, null, null, 62, null) + "], " + message);
            s sVar = new s();
            sVar.A0(tags);
            sVar.B0(level);
            sVar.C0(hVar);
            cul.h(sVar);
        } catch (Exception unused) {
        }
    }
}

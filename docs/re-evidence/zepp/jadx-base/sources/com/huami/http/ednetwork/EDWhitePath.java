package com.huami.http.ednetwork;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/http/ednetwork/EDWhitePath;", "", "", "path", "addPath", "removePath", "", "getWhitePath", "", "a", "Ljava/util/Set;", "whitePath", "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class EDWhitePath {

    @NotNull
    public static final EDWhitePath INSTANCE = new EDWhitePath();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static Set<String> whitePath = new LinkedHashSet();

    private EDWhitePath() {
    }

    @NotNull
    public final EDWhitePath addPath(@NotNull String path) {
        whitePath.add(path);
        return this;
    }

    @NotNull
    public final Set<String> getWhitePath() {
        return whitePath;
    }

    @NotNull
    public final EDWhitePath removePath(@NotNull String path) {
        if (whitePath.contains(path)) {
            whitePath.remove(path);
        }
        return this;
    }
}

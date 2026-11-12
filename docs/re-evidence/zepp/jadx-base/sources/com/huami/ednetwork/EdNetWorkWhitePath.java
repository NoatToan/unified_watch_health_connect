package com.huami.ednetwork;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/ednetwork/EdNetWorkWhitePath;", "", "", "path", "addHmPath", "addHmRegexPath", "", "getHmWhitePath", "getHmRegexWhitePath", "", "a", "Ljava/util/Set;", "hmWhitePath", "b", "hmRegexWhitePath", "<init>", "()V", "ednetwork_release"}, k = 1, mv = {1, 4, 0})
public final class EdNetWorkWhitePath {
    public static final EdNetWorkWhitePath INSTANCE = new EdNetWorkWhitePath();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Set<String> hmWhitePath = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Set<String> hmRegexWhitePath = new LinkedHashSet();

    private EdNetWorkWhitePath() {
    }

    @NotNull
    public final EdNetWorkWhitePath addHmPath(@NotNull String path) {
        hmWhitePath.add(path);
        return this;
    }

    @NotNull
    public final EdNetWorkWhitePath addHmRegexPath(@NotNull String path) {
        hmRegexWhitePath.add(path);
        return this;
    }

    @NotNull
    public final Set<String> getHmRegexWhitePath() {
        return hmRegexWhitePath;
    }

    @NotNull
    public final Set<String> getHmWhitePath() {
        return hmWhitePath;
    }
}

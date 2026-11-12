package kotlin.text;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "1.1")
public interface MatchNamedGroupCollection extends MatchGroupCollection {
    @Nullable
    MatchGroup get(@NotNull String str);
}

package kotlin.contracts;

import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
@ContractsDsl
@ExperimentalContracts
public enum InvocationKind {
    AT_MOST_ONCE,
    AT_LEAST_ONCE,
    EXACTLY_ONCE,
    UNKNOWN
}

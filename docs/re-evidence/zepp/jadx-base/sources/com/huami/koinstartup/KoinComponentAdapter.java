package com.huami.koinstartup;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/huami/koinstartup/KoinComponentAdapter;", "Lorg/koin/core/component/KoinComponent;", "koinstartup_release"}, k = 1, mv = {1, 5, 1})
public interface KoinComponentAdapter extends KoinComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Koin getKoin(@NotNull KoinComponentAdapter koinComponentAdapter) {
            return KoinComponent.DefaultImpls.getKoin(koinComponentAdapter);
        }
    }
}

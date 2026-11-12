package com.huami.koinstartup;

import android.content.Context;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/koinstartup/KoinInitializer;", "Landroidx/startup/Initializer;", "", "Lorg/koin/core/KoinApplication;", "koinApplication", "startKoin", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "create", "", "Ljava/lang/Class;", "dependencies", "koinstartup_release"}, k = 1, mv = {1, 5, 1})
public interface KoinInitializer extends Initializer<Unit> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static void create(@NotNull KoinInitializer koinInitializer, @NotNull Context context) {
            koinInitializer.startKoin((KoinApplication) AppInitializer.getInstance(context).initializeComponent(StartKoinInitializer.class));
        }

        @NotNull
        public static List<Class<? extends Initializer<?>>> dependencies(@NotNull KoinInitializer koinInitializer) {
            return new ArrayList();
        }
    }

    void create(@NotNull Context context);

    @Override // androidx.startup.Initializer
    @NotNull
    List<Class<? extends Initializer<?>>> dependencies();

    void startKoin(@NotNull KoinApplication koinApplication);
}

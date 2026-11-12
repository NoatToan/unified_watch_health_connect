package com.huami.message.di.koin;

import com.google.android.gms.common.Scopes;
import com.huami.message.api.MessageWebApi;
import com.huami.message.db.MessageDb;
import com.huami.message.dto.Profile;
import com.huami.message.util.AppExecutors;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0001¨\u0006\u000e"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "messageScope", "Lcom/huami/message/db/MessageDb;", "messageDb", "Lcom/huami/message/util/AppExecutors;", "messageAppExecutors", "Lcom/huami/message/api/MessageWebApi;", "messageWebApi", "appExecutors", "Lcom/huami/message/dto/Profile;", Scopes.PROFILE, "", "webHost", "message-mifit_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final AppExecutors appExecutors(@NotNull Scope scope) {
        return (AppExecutors) messageScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final AppExecutors messageAppExecutors(@NotNull Koin koin) {
        return (AppExecutors) messageScope(koin).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null);
    }

    @NotNull
    public static final MessageDb messageDb(@NotNull Koin koin) {
        return (MessageDb) messageScope(koin).get(Reflection.getOrCreateKotlinClass(MessageDb.class), null, null);
    }

    @NotNull
    public static final Scope messageScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "Message", QualifierKt.named("Message"), null, 4, null);
    }

    @NotNull
    public static final MessageWebApi messageWebApi(@NotNull Koin koin) {
        return (MessageWebApi) messageScope(koin).get(Reflection.getOrCreateKotlinClass(MessageWebApi.class), null, null);
    }

    @NotNull
    public static final Profile profile(@NotNull Scope scope) {
        return (Profile) messageScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Profile.class), null, null);
    }

    @NotNull
    public static final String webHost(@NotNull Scope scope) {
        return (String) messageScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(MessageQualifierNames.HOST), null);
    }

    @NotNull
    public static final MessageWebApi messageWebApi(@NotNull Scope scope) {
        return (MessageWebApi) messageScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(MessageWebApi.class), null, null);
    }
}

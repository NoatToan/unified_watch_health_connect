package com.xiaomi.fitness.health.net;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.djo;
import defpackage.emb;
import defpackage.kdq;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/net/SchemaService;", "", "getSchema", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/health/net/SchemaRes;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download", "Lokhttp3/ResponseBody;", "url", "Companion", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SchemaService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String SCHEMA_PATH = "healthapp/";

    @NotNull
    public static final String SCHEME_HOST = "https://hlth.io.mi.com/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/health/net/SchemaService$Companion;", "", "<init>", "()V", "SCHEME_HOST", "", "SCHEMA_PATH", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String SCHEMA_PATH = "healthapp/";

        @NotNull
        public static final String SCHEME_HOST = "https://hlth.io.mi.com/";

        private Companion() {
        }
    }

    @djo
    @emb({"RegionTag:ignore"})
    @Nullable
    @uua
    Object download(@kdq @Nullable String str, @NotNull Continuation<? super ResponseBody> continuation);

    @Nullable
    @uua("setting/get_device_schema_protocol")
    Object getSchema(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<SchemaRes>> continuation);
}

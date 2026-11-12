package com.garmin.android.lib.garminmobileanalytics;

import am.j;
import android.content.Context;
import androidx.room.a0;
import androidx.work.c;
import com.google.gson.Gson;
import e23.p;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;
import java.util.UUID;
import kc2.h;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import ue.f;
import ue.i0;
import ue.l;
import ue.v;
import ue.x;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ljava/util/UUID;", "<anonymous>", "(Lo53/b0;)Ljava/util/UUID;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.garmin.android.lib.garminmobileanalytics.OmtAnalyticsUtil$Companion$sendProductSupportAnalytics$2", f = "OmtAnalyticsUtil.kt", l = {}, m = "invokeSuspend")
public final class a extends i implements p<b0, d<? super UUID>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt2.d f49923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f49924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f49925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc2.d f49926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yt2.d dVar, String str, File file, jc2.d dVar2, d<? super a> dVar3) {
        super(2, dVar3);
        this.f49923a = dVar;
        this.f49924b = str;
        this.f49925c = file;
        this.f49926d = dVar2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f49923a, this.f49924b, this.f49925c, this.f49926d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super UUID> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ProductSupportLogsWorker.f49919e.getClass();
        yt2.d dVar = this.f49923a;
        dVar.getClass();
        String str = this.f49924b;
        str.getClass();
        File file = this.f49925c;
        file.getClass();
        jc2.d dVar2 = this.f49926d;
        dVar2.getClass();
        Logger logger = LoggerFactory.getLogger("OMT#ProdSuppLogsWorker");
        logger.getClass();
        logger.debug("enqueueDirectoryWork: referenceCode[{}], sortPriority[{}], directory[{}], sortPriority[{}]", str, dVar2, file.getAbsolutePath(), dVar2.name());
        String absolutePath = file.getAbsolutePath();
        if (!file.isDirectory()) {
            String strM = j.m("[", absolutePath, "] is not a directory");
            logger.error("validateDirectory: ".concat(strM));
            throw new InvalidParameterException(strM);
        }
        absolutePath.getClass();
        if (!file.canRead()) {
            String str2 = "validateDirectory: [" + absolutePath + "] cannot be read";
            logger.error(str2);
            throw new InvalidParameterException(str2);
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            String strM2 = j.m("[", absolutePath, "] is empty");
            logger.error("validateDirectory: ".concat(strM2));
            throw new InvalidParameterException(strM2);
        }
        ProductSupportLogsWorker.a.EnumC0992a enumC0992a = ProductSupportLogsWorker.a.EnumC0992a.DIRECTORY;
        c.a aVar2 = new c.a();
        String strName = dVar2.name();
        LinkedHashMap linkedHashMap = aVar2.f11467a;
        linkedHashMap.put("key_sort_priority_enum_name", strName);
        linkedHashMap.put("key_directory_absolute_path", absolutePath);
        try {
            linkedHashMap.put("key_analytics_client_info", new Gson().toJson(new kc2.a(dVar.d().f199677c, new h(dVar.d().f199675a, dVar.d().f199676b), null, null, 12, null)));
            linkedHashMap.put("mode_enum_name", enumC0992a.name());
            linkedHashMap.put("key_omt_api_url", dVar.b().f2788a + "/api/client-logs/" + str + "/upload");
            c cVarA = aVar2.a();
            x.a aVar3 = new x.a((Class<? extends androidx.work.d>) ProductSupportLogsWorker.class);
            f.a aVar4 = new f.a();
            aVar4.b(v.CONNECTED);
            aVar3.f170098c.f26950j = aVar4.a();
            x xVarA = aVar3.f(cVarA).a();
            Context f199650a = dVar.getF199650a();
            i0.f170088a.getClass();
            i0.a.a(f199650a).c(enumC0992a.getUniqueWorkName(), l.REPLACE, xVarA);
            return xVarA.f170093a;
        } catch (Exception e4) {
            logger.error(a0.j("enqueueWork: mode ", enumC0992a.name(), ", referenceCode ", str), (Throwable) e4);
            throw e4;
        }
    }
}

package com.xiaomi.ai.edge;

import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.edge.model.EdgeAsrDataCategory;
import defpackage.a08;
import defpackage.aqe;
import defpackage.b08;
import defpackage.c7g;
import defpackage.i08;
import defpackage.k08;
import defpackage.n08;
import defpackage.qpe;
import defpackage.wz7;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class EdgeNluFacade {
    private static final qpe LOGGER = aqe.f(EdgeNluFacade.class);

    public interface b {
        String a(String str);

        File b(String str);

        void c(String str, String str2);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EdgeNluFacade f11034a = new EdgeNluFacade();
    }

    public static EdgeNluFacade getInstance() {
        return c.f11034a;
    }

    public static boolean isCouldResourceUpdate(b bVar) {
        return c7g.i(bVar);
    }

    public void freeBaseModel() {
        c7g.a();
    }

    public Map<EdgeAsrDataCategory, List<String>> getNormalizeDataForAsr(n08 n08Var) {
        try {
            return c7g.d(n08Var);
        } catch (Exception e) {
            LOGGER.error("getNormalizeDataForAsr() occur error: {}", (Throwable) e);
            return null;
        }
    }

    public void initBaseModel() {
        c7g.f();
    }

    public void invalidPhoneCallData() {
        c7g.h();
    }

    public boolean isPhoneCallDataInit() {
        return c7g.j();
    }

    public boolean loadModelByCache(InputStream inputStream) {
        try {
            return c7g.k(inputStream);
        } catch (Exception e) {
            LOGGER.error("loadModelByCache() occur error: {}", (Throwable) e);
            return false;
        }
    }

    public boolean loadModelByData(i08 i08Var, OutputStream outputStream) {
        try {
            return c7g.l(i08Var, outputStream);
        } catch (Exception e) {
            LOGGER.error("loadModelByData() occur error: {}", (Throwable) e);
            return false;
        }
    }

    public boolean loadModelByDataWithCouldResources(i08 i08Var, OutputStream outputStream, b bVar) {
        try {
            return c7g.m(i08Var, outputStream, bVar);
        } catch (Exception e) {
            LOGGER.error("loadModelByDataWithCouldResources() occur error: {}", (Throwable) e);
            return false;
        }
    }

    public void setResourceUpdateFolder(String str) {
        System.setProperty("edge.resource.update.folder", str);
    }

    public a08 solveAnswer(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        try {
            return wz7.a().b(jSONObject, jSONObject2, n08Var);
        } catch (Exception e) {
            LOGGER.error("solveAnswer() occur error: {}", (Throwable) e);
            return null;
        }
    }

    public b08 solveAnswerV3(JSONObject jSONObject, List<Instruction> list, n08 n08Var) {
        try {
            return wz7.a().c(jSONObject, list, n08Var);
        } catch (Exception e) {
            LOGGER.error("solveAnswerV3() occur error: {}", (Throwable) e);
            return null;
        }
    }

    public JSONObject solveIntention(JSONObject jSONObject, n08 n08Var) {
        return solveIntention(jSONObject, n08Var, null);
    }

    private EdgeNluFacade() {
    }

    public JSONObject solveIntention(JSONObject jSONObject, n08 n08Var, k08 k08Var) {
        try {
            return wz7.a().d(jSONObject, n08Var, k08Var);
        } catch (Exception e) {
            LOGGER.error("solveIntention() occur error: {}", (Throwable) e);
            return null;
        }
    }
}

package com.xiaomi.ai.domain.phonecall.tools;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.domain.phonecall.PhoneCallSolver;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.parser.PhoneCallParserImpl;
import defpackage.a08;
import defpackage.n08;
import java.io.PrintStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallTestTool {
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static void main(String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject("{\"contacts\":[{\"user_id\":\"2\",\"name\":\"老婆\",\"phone_list\":[{\"number\":\"123434459\",\"type\":2}]},{\"user_id\":\"0\",\"name\":\"李四\",\"phone_list\":[{\"number\":\"123456\",\"type\":1},{\"number\":\"123457\",\"type\":3}]},{\"user_id\":\"1\",\"name\":\"小李四\",\"phone_list\":[{\"number\":\"123458\",\"type\":1}]},{\"user_id\":\"2\",\"name\":\"汪捂\",\"phone_list\":[{\"number\":\"123459\",\"type\":2}]},{\"user_id\":\"3\",\"name\":\"李撕\",\"phone_list\":[{\"number\":\"123460\",\"type\":1}]},{\"user_id\":\"4\",\"name\":\"张三\",\"phone_list\":[{\"number\":\"123461\",\"type\":2},{\"number\":\"123462\",\"type\":2}]},{\"user_id\":\"5\",\"name\":\"赵六\",\"phone_list\":[{\"number\":\"123463\",\"type\":2}]},{\"user_id\":\"6\",\"name\":\"孙七\",\"phone_list\":[{\"number\":\"\",\"type\":2}]}]}");
            PhoneCallParserImpl phoneCallParserImpl = new PhoneCallParserImpl();
            PhoneCallSolver phoneCallSolver = new PhoneCallSolver();
            phoneCallSolver.initContacts(jSONObject);
            n08 n08Var = new n08();
            n08Var.setDeviceId("5f5ca7653d5d4876ab32501cef491421");
            n08Var.setAppId("354623078514296832");
            n08Var.setAppName("M01");
            PhoneCallIntention phoneCallIntention = phoneCallParserImpl.parse("我要打电话给爸爸", Boolean.FALSE, (JSONObject) null, (JSONObject) null);
            PrintStream printStream = System.out;
            printStream.println("第一轮在线parser结果:" + GSON.toJson(phoneCallIntention));
            a08 a08VarProvide = phoneCallSolver.provide(phoneCallSolver.parse("我要打电话给爸爸", n08Var), null, n08Var);
            printStream.println("第一轮provider结果:" + a08VarProvide.b().toString());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", a08VarProvide.b().getJSONArray("answer"));
            n08Var.getContext().f(jSONObject2);
            JSONObject jSONObject3 = phoneCallSolver.parse("张三", n08Var);
            printStream.println("第二轮parser结果:action:" + jSONObject3.optString("action") + " " + jSONObject3.toString());
            a08 a08VarProvide2 = phoneCallSolver.provide(jSONObject3, null, n08Var);
            printStream.println("第二轮provider结果:action:" + a08VarProvide2.b().getJSONArray("answer").getJSONObject(0).optString("action") + " " + a08VarProvide2.b().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

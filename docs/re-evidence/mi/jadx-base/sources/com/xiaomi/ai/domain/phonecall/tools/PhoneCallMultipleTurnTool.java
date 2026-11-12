package com.xiaomi.ai.domain.phonecall.tools;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.ai.domain.phonecall.PhoneCallSolver;
import com.xiaomi.ai.domain.phonecall.parser.PhoneCallParserImpl;
import defpackage.a08;
import defpackage.n08;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallMultipleTurnTool {
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    public static void main(String[] strArr) {
        try {
            JSONObject jSONObject = new JSONObject("{\"contacts\":[{\"user_id\":\"2\",\"name\":\"老婆\",\"phone_list\":[{\"number\":\"123434459\",\"type\":2}]},{\"user_id\":\"0\",\"name\":\"李四\",\"phone_list\":[{\"number\":\"123456\",\"type\":1},{\"number\":\"123457\",\"type\":3}]},{\"user_id\":\"1\",\"name\":\"小李四\",\"phone_list\":[{\"number\":\"123458\",\"type\":1}]},{\"user_id\":\"2\",\"name\":\"汪捂\",\"phone_list\":[{\"number\":\"123459\",\"type\":2}]},{\"user_id\":\"3\",\"name\":\"李撕\",\"phone_list\":[{\"number\":\"123460\",\"type\":1}]},{\"user_id\":\"4\",\"name\":\"张三\",\"phone_list\":[{\"number\":\"123461\",\"type\":2},{\"number\":\"123462\",\"type\":2}]},{\"user_id\":\"5\",\"name\":\"赵六\",\"phone_list\":[{\"number\":\"123463\",\"type\":2}]},{\"user_id\":\"6\",\"name\":\"孙七\",\"phone_list\":[{\"number\":\"\",\"type\":2}]}]}");
            new PhoneCallParserImpl();
            PhoneCallSolver phoneCallSolver = new PhoneCallSolver();
            phoneCallSolver.initContacts(jSONObject);
            n08 n08Var = new n08();
            n08Var.setDeviceId("5f5ca7653d5d4876ab32501cef491421");
            JSONObject jSONObject2 = new JSONObject();
            int i = 3;
            char c = 2;
            List listAsList = Arrays.asList("我要打电话给儿子", "张三", "第一个");
            int i2 = 0;
            while (i2 < listAsList.size()) {
                JSONObject jSONObject3 = phoneCallSolver.parse((String) listAsList.get(i2), n08Var);
                Object[] objArr = new Object[i];
                i2++;
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = jSONObject3.optString("action");
                objArr[c] = jSONObject3.toString();
                String str = String.format("第%d轮parser结果:action:%s %s", objArr);
                PrintStream printStream = System.out;
                printStream.println(str);
                a08 a08VarProvide = phoneCallSolver.provide(jSONObject3, null, n08Var);
                JSONObject jSONObjectB = a08VarProvide.b();
                Object[] objArr2 = new Object[i];
                objArr2[0] = Integer.valueOf(i2);
                objArr2[1] = jSONObjectB.getJSONArray("answer").getJSONObject(0).optString("action");
                objArr2[2] = jSONObjectB.toString();
                String str2 = String.format("第%d轮provider结果:action:%s %s", objArr2);
                jSONObject2.remove("data");
                jSONObject2.put("data", a08VarProvide.b().getJSONArray("answer"));
                n08Var.getContext().f(jSONObject2);
                printStream.println(str2);
                c = 2;
                i = 3;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.json.JsonSanitizer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.muscleview.data.HealthBodyPath;
import com.huawei.ui.commonui.muscleview.data.HealthMuscleInfo;
import com.huawei.ui.commonui.muscleview.data.HealthMusclePath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qos {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile qos f46577b;

    public static qos d() {
        qos qosVar;
        synchronized (qos.class) {
            synchronized (qos.class) {
                if (f46577b == null) {
                    f46577b = new qos();
                }
                qosVar = f46577b;
            }
            return qosVar;
        }
        return qosVar;
    }

    private String d(String str, Context context) throws Throwable {
        BufferedReader bufferedReader;
        if (context == null) {
            LogUtil.j("MuscleJsonUtil", "getJson context == null");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str), StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                break;
                            } catch (IOException e) {
                                LogUtil.e("MuscleJsonUtil", "getJson error:", e.getMessage());
                            }
                        } else {
                            sb.append(line);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader2 = bufferedReader;
                        LogUtil.e("MuscleJsonUtil", "getJson error:", e.getMessage());
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e3) {
                                LogUtil.e("MuscleJsonUtil", "getJson error:", e3.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e4) {
                                LogUtil.e("MuscleJsonUtil", "getJson error:", e4.getMessage());
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException e5) {
            e = e5;
        }
        return JsonSanitizer.sanitize(sb.toString());
    }

    public List<HealthBodyPath> e(Context context, int i) throws Throwable {
        String strD;
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            strD = d("body/front.data", context);
        } else if (i != 2) {
            strD = "";
        } else {
            strD = d("body/back.data", context);
        }
        try {
            return (List) new Gson().fromJson(JsonSanitizer.sanitize(strD), new HealthBodyPath.BodyPathType().getType());
        } catch (JsonSyntaxException e) {
            LogUtil.e("MuscleJsonUtil", "getBodyPath error:", e.getMessage());
            return arrayList;
        }
    }

    public List<HealthMusclePath> b(Context context, int i) throws Throwable {
        String strD;
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            strD = d("body/front_body.data", context);
        } else if (i != 2) {
            strD = "";
        } else {
            strD = d("body/back_body.data", context);
        }
        try {
            return (List) new Gson().fromJson(JsonSanitizer.sanitize(strD), new HealthMusclePath.MuscleType().getType());
        } catch (JsonSyntaxException e) {
            LogUtil.e("MuscleJsonUtil", "getMusclePath error:", e.getMessage());
            return arrayList;
        }
    }

    public HealthMuscleInfo e(Context context, int i, int i2) throws Throwable {
        String strD;
        List arrayList = new ArrayList();
        if (i == 1) {
            strD = d("body/musclePositiveInfo.json", context);
        } else if (i != 2) {
            strD = "";
        } else {
            strD = d("body/muscleNegativeInfo.json", context);
        }
        try {
            arrayList = (List) new Gson().fromJson(JsonSanitizer.sanitize(strD), new HealthMuscleInfo.MuscleType().getType());
        } catch (JsonSyntaxException e) {
            LogUtil.e("MuscleJsonUtil", "getMuscleInfo error:", e.getMessage());
        }
        if (i2 >= arrayList.size() || i2 < 0) {
            LogUtil.j("MuscleJsonUtil", "getMuscleInfo index error");
            return null;
        }
        return (HealthMuscleInfo) arrayList.get(i2);
    }
}

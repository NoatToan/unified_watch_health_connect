package com.huawei.codevalueplatform.coderule.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.codevalueplatform.coderule.bean.basebean.Rule;
import com.huawei.codevalueplatform.coderule.bean.response.CodeRulesResponse;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import defpackage.chm;
import defpackage.chs;
import defpackage.cib;
import defpackage.cig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes4.dex */
public class CodeRulesUpdater {
    private final chs e = new chs();
    private UpdateCallback d = null;

    public interface UpdateCallback {
        void onUpdate(String str, List<Rule> list);
    }

    public List<Rule> b() {
        CodeRulesResponse codeRulesResponseA = a();
        if (codeRulesResponseA != null && codeRulesResponseA.getRuleList() != null) {
            return codeRulesResponseA.getRuleList();
        }
        return new ArrayList();
    }

    public void b(String str, UpdateCallback updateCallback) {
        this.d = updateCallback;
        e(str);
    }

    public void e(String str) {
        this.e.d(str);
        CodeRulesResponse codeRulesResponseA = a();
        if (codeRulesResponseA == null) {
            codeRulesResponseA = new CodeRulesResponse();
        }
        List<Rule> ruleList = codeRulesResponseA.getRuleList();
        if (!d() && ruleList != null && !ruleList.isEmpty()) {
            cib.b("CodeRulesUpdater", "rule is cached");
            UpdateCallback updateCallback = this.d;
            if (updateCallback != null) {
                updateCallback.onUpdate(c(), ruleList);
                return;
            }
            return;
        }
        cib.b("CodeRulesUpdater", "rule is out of date or not cached, update");
        d(0, new ArrayList(), codeRulesResponseA.getCacheVersion());
    }

    private boolean d() {
        long jA = cig.a("last_code_rule_update_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 3600000;
        cib.b("CodeRulesUpdater", "recordHours:" + jA + " currentHours:" + jCurrentTimeMillis);
        return jCurrentTimeMillis - jA > 168;
    }

    private void a(String str) throws Throwable {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(c()), false), "UTF-8"));
                    try {
                        bufferedWriter.write(str);
                        cib.b("CodeRulesUpdater", "file saved success");
                        bufferedWriter.close();
                    } catch (IOException unused) {
                        bufferedWriter2 = bufferedWriter;
                        cib.d("CodeRulesUpdater", "file write failed");
                        if (bufferedWriter2 != null) {
                            bufferedWriter2.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused2) {
                                cib.d("CodeRulesUpdater", "file release failed");
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                }
            } catch (IOException unused3) {
            }
        } catch (IOException unused4) {
            cib.d("CodeRulesUpdater", "file release failed");
        }
    }

    private CodeRulesResponse a() {
        String strC = c();
        cib.b("CodeRulesUpdater", "read file start");
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader(strC);
            try {
                CodeRulesResponse codeRulesResponse = (CodeRulesResponse) new Gson().fromJson((Reader) fileReader, CodeRulesResponse.class);
                cib.b("CodeRulesUpdater", "read file end");
                if (codeRulesResponse == null || codeRulesResponse.getRuleList() == null) {
                    fileReader.close();
                    return null;
                }
                fileReader.close();
                return codeRulesResponse;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            cib.d("CodeRulesUpdater", "read file io error");
            return null;
        } catch (Exception unused2) {
            cib.d("CodeRulesUpdater", "read file unknown error");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        return chm.c().getFilesDir().getPath() + File.separator + "query_cache.json";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final List<Rule> list, final int i2) {
        a(i).enqueue(new Callback<CodeRulesResponse>() { // from class: com.huawei.codevalueplatform.coderule.model.CodeRulesUpdater.2
            @Override // com.huawei.hms.network.httpclient.Callback
            public void onResponse(Submit<CodeRulesResponse> submit, Response<CodeRulesResponse> response) throws Throwable {
                CodeRulesResponse body = response.getBody();
                if (body == null) {
                    cib.c("CodeRulesUpdater", "getCodeRules startIndex " + i + " interrupt");
                    if (CodeRulesUpdater.this.d != null) {
                        CodeRulesUpdater.this.d.onUpdate(CodeRulesUpdater.this.c(), list);
                        return;
                    }
                    return;
                }
                String resultCode = body.getResultCode();
                CodeRulesUpdater.this.b(i, resultCode);
                List listC = CodeRulesUpdater.this.c(body, resultCode);
                Integer nextIdx = body.getNextIdx();
                cib.b("CodeRulesUpdater", "getCodeRules, nextIndex: " + nextIdx);
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(listC);
                int cacheVersion = body.getCacheVersion();
                if (nextIdx != null && cacheVersion > i2) {
                    CodeRulesUpdater.this.d(nextIdx.intValue(), arrayList, i2);
                    return;
                }
                cib.b("CodeRulesUpdater", "cloudVersion: " + cacheVersion + " localVersion: " + i2);
                if (cacheVersion > i2) {
                    cib.b("CodeRulesUpdater", "find new cloud version, update cache");
                    CodeRulesUpdater.this.c(cacheVersion, arrayList);
                } else {
                    cib.b("CodeRulesUpdater", "no new cloud version found, do not update cache, interrupt request");
                }
                if (CodeRulesUpdater.this.d != null) {
                    CodeRulesUpdater.this.d.onUpdate(CodeRulesUpdater.this.c(), arrayList);
                }
            }

            @Override // com.huawei.hms.network.httpclient.Callback
            public void onFailure(Submit<CodeRulesResponse> submit, Throwable th) {
                cib.d("CodeRulesUpdater", "getCodeRules startIndex " + i + " fail: " + th.getMessage());
                if (CodeRulesUpdater.this.d != null) {
                    CodeRulesUpdater.this.d.onUpdate(CodeRulesUpdater.this.c(), list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, List<Rule> list) throws Throwable {
        cig.e("last_code_rule_update_time", System.currentTimeMillis() / 3600000);
        CodeRulesResponse codeRulesResponse = new CodeRulesResponse();
        codeRulesResponse.setCacheVersion(i);
        codeRulesResponse.setRuleList(list);
        a(new Gson().toJson(codeRulesResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Rule> c(CodeRulesResponse codeRulesResponse, String str) {
        List<Rule> ruleList = codeRulesResponse.getRuleList();
        if (TextUtils.equals(str, "0") && ruleList != null) {
            return (List) ruleList.stream().filter(new Predicate() { // from class: chp
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((Rule) obj);
                }
            }).collect(Collectors.toList());
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        String str2;
        if (TextUtils.equals(str, "00201001") || TextUtils.equals(str, "00201002") || TextUtils.equals(str, "00202001")) {
            str2 = "get rule fail";
        } else if (TextUtils.equals(str, "00203001")) {
            str2 = "rule not update";
        } else if (TextUtils.equals(str, "0")) {
            str2 = "get rule success";
        } else {
            str2 = "unknown status";
        }
        cib.b("CodeRulesUpdater", "getCodeRules start index is " + i + ", errorCode: " + str + ", " + str2);
    }

    private Submit<CodeRulesResponse> a(int i) {
        return this.e.b(i);
    }
}

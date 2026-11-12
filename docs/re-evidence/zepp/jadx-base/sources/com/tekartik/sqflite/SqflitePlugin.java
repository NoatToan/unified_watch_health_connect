package com.tekartik.sqflite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.tekartik.sqflite.dev.Debug;
import com.tekartik.sqflite.operation.BatchOperation;
import com.tekartik.sqflite.operation.ExecuteOperation;
import com.tekartik.sqflite.operation.MethodCallOperation;
import com.tekartik.sqflite.operation.Operation;
import com.tekartik.sqflite.operation.SqlErrorInfo;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SqflitePlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public static String i;
    private static HandlerThread k;
    private static Handler l;
    private Context a;
    private MethodChannel b;
    public static final Map<String, Integer> c = new HashMap();
    private static boolean d = false;
    private static int e = 0;
    public static int f = 0;
    private static final Object g = new Object();
    private static final Object h = new Object();
    private static int j = 0;

    @SuppressLint({"UseSparseArrays"})
    public static final Map<Integer, com.tekartik.sqflite.a> m = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ MethodCall a;
        public final /* synthetic */ i b;
        public final /* synthetic */ com.tekartik.sqflite.a c;

        public a(MethodCall methodCall, i iVar, com.tekartik.sqflite.a aVar) {
            this.a = methodCall;
            this.b = iVar;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            SqflitePlugin.this.N(this.c, new MethodCallOperation(this.a, this.b));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ MethodCall a;
        public final /* synthetic */ i b;
        public final /* synthetic */ com.tekartik.sqflite.a c;

        public b(MethodCall methodCall, i iVar, com.tekartik.sqflite.a aVar) {
            this.a = methodCall;
            this.b = iVar;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodCallOperation methodCallOperation = new MethodCallOperation(this.a, this.b);
            boolean noResult = methodCallOperation.getNoResult();
            boolean continueOnError = methodCallOperation.getContinueOnError();
            List list = (List) this.a.argument(Constant.j);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BatchOperation batchOperation = new BatchOperation((Map) it2.next(), noResult);
                String method = batchOperation.getMethod();
                method.hashCode();
                switch (method) {
                    case "execute":
                        if (!SqflitePlugin.this.o(this.c, batchOperation)) {
                            if (!continueOnError) {
                                batchOperation.handleError(this.b);
                                return;
                            }
                            batchOperation.handleErrorContinue(arrayList);
                            break;
                        } else {
                            batchOperation.handleSuccess(arrayList);
                            break;
                        }
                        break;
                    case "insert":
                        if (!SqflitePlugin.this.x(this.c, batchOperation)) {
                            if (!continueOnError) {
                                batchOperation.handleError(this.b);
                                return;
                            }
                            batchOperation.handleErrorContinue(arrayList);
                            break;
                        } else {
                            batchOperation.handleSuccess(arrayList);
                            break;
                        }
                        break;
                    case "update":
                        if (!SqflitePlugin.this.P(this.c, batchOperation)) {
                            if (!continueOnError) {
                                batchOperation.handleError(this.b);
                                return;
                            }
                            batchOperation.handleErrorContinue(arrayList);
                            break;
                        } else {
                            batchOperation.handleSuccess(arrayList);
                            break;
                        }
                        break;
                    case "query":
                        if (!SqflitePlugin.this.N(this.c, batchOperation)) {
                            if (!continueOnError) {
                                batchOperation.handleError(this.b);
                                return;
                            }
                            batchOperation.handleErrorContinue(arrayList);
                            break;
                        } else {
                            batchOperation.handleSuccess(arrayList);
                            break;
                        }
                        break;
                    default:
                        this.b.error(Constant.l, "Batch method '" + method + "' not supported", null);
                        return;
                }
            }
            if (noResult) {
                this.b.success(null);
            } else {
                this.b.success(arrayList);
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ MethodCall a;
        public final /* synthetic */ i b;
        public final /* synthetic */ com.tekartik.sqflite.a c;

        public c(MethodCall methodCall, i iVar, com.tekartik.sqflite.a aVar) {
            this.a = methodCall;
            this.b = iVar;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            SqflitePlugin.this.x(this.c, new MethodCallOperation(this.a, this.b));
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ com.tekartik.sqflite.a a;
        public final /* synthetic */ MethodCall b;
        public final /* synthetic */ i c;

        public d(com.tekartik.sqflite.a aVar, MethodCall methodCall, i iVar) {
            this.a = aVar;
            this.b = methodCall;
            this.c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SqflitePlugin.this.p(this.a, this.b, this.c) == null) {
                return;
            }
            this.c.success(null);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ MethodCall a;
        public final /* synthetic */ i b;
        public final /* synthetic */ com.tekartik.sqflite.a c;

        public e(MethodCall methodCall, i iVar, com.tekartik.sqflite.a aVar) {
            this.a = methodCall;
            this.b = iVar;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            SqflitePlugin.this.P(this.c, new MethodCallOperation(this.a, this.b));
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ i c;
        public final /* synthetic */ Boolean d;
        public final /* synthetic */ com.tekartik.sqflite.a e;
        public final /* synthetic */ MethodCall f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ int h;

        public f(boolean z, String str, i iVar, Boolean bool, com.tekartik.sqflite.a aVar, MethodCall methodCall, boolean z2, int i) {
            this.a = z;
            this.b = str;
            this.c = iVar;
            this.d = bool;
            this.e = aVar;
            this.f = methodCall;
            this.g = z2;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SqflitePlugin.h) {
                if (!this.a) {
                    File file = new File(new File(this.b).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        this.c.error(Constant.k, "open_failed " + this.b, null);
                        return;
                    }
                }
                try {
                    if (Boolean.TRUE.equals(this.d)) {
                        this.e.i();
                    } else {
                        this.e.h();
                    }
                    synchronized (SqflitePlugin.g) {
                        if (this.g) {
                            SqflitePlugin.c.put(this.b, Integer.valueOf(this.h));
                        }
                        SqflitePlugin.m.put(Integer.valueOf(this.h), this.e);
                    }
                    if (LogLevel.b(this.e.d)) {
                        Log.d(Constant.TAG, this.e.e() + "opened " + this.h + " " + this.b);
                    }
                    this.c.success(SqflitePlugin.z(this.h, false, false));
                } catch (Exception e) {
                    SqflitePlugin.this.w(e, new MethodCallOperation(this.f, this.c), this.e);
                }
            }
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ com.tekartik.sqflite.a a;
        public final /* synthetic */ i b;

        public g(com.tekartik.sqflite.a aVar, i iVar) {
            this.a = aVar;
            this.b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SqflitePlugin.h) {
                SqflitePlugin.this.k(this.a);
            }
            this.b.success(null);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ com.tekartik.sqflite.a a;
        public final /* synthetic */ String b;
        public final /* synthetic */ i c;

        public h(com.tekartik.sqflite.a aVar, String str, i iVar) {
            this.a = aVar;
            this.b = str;
            this.c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (SqflitePlugin.h) {
                com.tekartik.sqflite.a aVar = this.a;
                if (aVar != null) {
                    SqflitePlugin.this.k(aVar);
                }
                try {
                    if (LogLevel.c(SqflitePlugin.f)) {
                        Log.d(Constant.TAG, "delete database " + this.b);
                    }
                    com.tekartik.sqflite.a.b(this.b);
                } catch (Exception e) {
                    Log.e(Constant.TAG, "error " + e + " while closing database " + SqflitePlugin.j);
                }
            }
            this.c.success(null);
        }
    }

    public class i implements MethodChannel.Result {
        public final Handler a;
        private final MethodChannel.Result b;

        public class a implements Runnable {
            public final /* synthetic */ Object a;

            public a(Object obj) {
                this.a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.success(this.a);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Object c;

            public b(String str, String str2, Object obj) {
                this.a = str;
                this.b = str2;
                this.c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.error(this.a, this.b, this.c);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.b.notImplemented();
            }
        }

        public /* synthetic */ i(SqflitePlugin sqflitePlugin, MethodChannel.Result result, a aVar) {
            this(result);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(String str, String str2, Object obj) {
            this.a.post(new b(str, str2, obj));
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            this.a.post(new c());
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(Object obj) {
            this.a.post(new a(obj));
        }

        private i(MethodChannel.Result result) {
            this.a = new Handler(Looper.getMainLooper());
            this.b = result;
        }
    }

    public SqflitePlugin() {
    }

    private void A(Context context, BinaryMessenger binaryMessenger) {
        this.a = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite");
        this.b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    private void B(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        l.post(new b(methodCall, new i(this, result, null), aVarU));
    }

    private void C(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        if (LogLevel.b(aVarU.d)) {
            Log.d(Constant.TAG, aVarU.e() + "closing " + iIntValue + " " + aVarU.b);
        }
        String str = aVarU.b;
        synchronized (g) {
            m.remove(Integer.valueOf(iIntValue));
            if (aVarU.a) {
                c.remove(str);
            }
        }
        l.post(new g(aVarU, new i(this, result, null)));
    }

    private void D(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument(Constant.h);
        HashMap map = new HashMap();
        if ("get".equals(str)) {
            int i2 = f;
            if (i2 > 0) {
                map.put(Constant.e, Integer.valueOf(i2));
            }
            Map<Integer, com.tekartik.sqflite.a> map2 = m;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, com.tekartik.sqflite.a> entry : map2.entrySet()) {
                    com.tekartik.sqflite.a value = entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", value.b);
                    map4.put(Constant.d, Boolean.valueOf(value.a));
                    int i3 = value.d;
                    if (i3 > 0) {
                        map4.put(Constant.e, Integer.valueOf(i3));
                    }
                    map3.put(entry.getKey().toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        result.success(map);
    }

    private void E(MethodCall methodCall, MethodChannel.Result result) {
        Debug.LOGV = Boolean.TRUE.equals(methodCall.arguments());
        Debug.EXTRA_LOGV = Debug._EXTRA_LOGV && Debug.LOGV;
        if (!Debug.LOGV) {
            f = 0;
        } else if (Debug.EXTRA_LOGV) {
            f = 2;
        } else if (Debug.LOGV) {
            f = 1;
        }
        result.success(null);
    }

    private void F(MethodCall methodCall, MethodChannel.Result result) {
        a aVar;
        com.tekartik.sqflite.a aVar2;
        Map<Integer, com.tekartik.sqflite.a> map;
        String str = (String) methodCall.argument("path");
        synchronized (g) {
            if (LogLevel.c(f)) {
                Log.d(Constant.TAG, "Look for " + str + " in " + c.keySet());
            }
            Map<String, Integer> map2 = c;
            Integer num = map2.get(str);
            aVar = null;
            if (num == null || (aVar2 = (map = m).get(num)) == null || !aVar2.e.isOpen()) {
                aVar2 = null;
            } else {
                if (LogLevel.c(f)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar2.e());
                    sb.append("found single instance ");
                    sb.append(aVar2.f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d(Constant.TAG, sb.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        h hVar = new h(aVar2, str, new i(this, result, aVar));
        Handler handler = l;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    private void G(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        l.post(new d(aVarU, methodCall, new i(this, result, null)));
    }

    private void I(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        l.post(new c(methodCall, new i(this, result, null), aVarU));
    }

    private void J(MethodCall methodCall, MethodChannel.Result result) {
        int i2;
        com.tekartik.sqflite.a aVar;
        String str = (String) methodCall.argument("path");
        Boolean bool = (Boolean) methodCall.argument(Constant.c);
        boolean zY = y(str);
        boolean z = (Boolean.FALSE.equals(methodCall.argument(Constant.d)) || zY) ? false : true;
        if (z) {
            synchronized (g) {
                if (LogLevel.c(f)) {
                    Log.d(Constant.TAG, "Look for " + str + " in " + c.keySet());
                }
                Integer num = c.get(str);
                if (num != null && (aVar = m.get(num)) != null) {
                    if (aVar.e.isOpen()) {
                        if (LogLevel.c(f)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.e());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d(Constant.TAG, sb.toString());
                        }
                        result.success(z(num.intValue(), true, aVar.f));
                        return;
                    }
                    if (LogLevel.c(f)) {
                        Log.d(Constant.TAG, aVar.e() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = g;
        synchronized (obj) {
            i2 = j + 1;
            j = i2;
        }
        com.tekartik.sqflite.a aVar2 = new com.tekartik.sqflite.a(str, i2, z, f);
        i iVar = new i(this, result, null);
        synchronized (obj) {
            if (l == null) {
                HandlerThread handlerThread = new HandlerThread(Constant.TAG, e);
                k = handlerThread;
                handlerThread.start();
                l = new Handler(k.getLooper());
                if (LogLevel.b(aVar2.d)) {
                    Log.d(Constant.TAG, aVar2.e() + "starting thread" + k + " priority " + e);
                }
            }
            if (LogLevel.b(aVar2.d)) {
                Log.d(Constant.TAG, aVar2.e() + "opened " + i2 + " " + str);
            }
            l.post(new f(zY, str, iVar, bool, aVar2, methodCall, z, i2));
        }
    }

    private void L(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        l.post(new a(methodCall, new i(this, result, null), aVarU));
    }

    private void M(MethodCall methodCall, MethodChannel.Result result) {
        com.tekartik.sqflite.a aVarU = u(methodCall, result);
        if (aVarU == null) {
            return;
        }
        l.post(new e(methodCall, new i(this, result, null), aVarU));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(com.tekartik.sqflite.a aVar, Operation operation) throws Throwable {
        SqlCommand sqlCommand = operation.getSqlCommand();
        ArrayList arrayList = new ArrayList();
        if (LogLevel.b(aVar.d)) {
            Log.d(Constant.TAG, aVar.e() + sqlCommand);
        }
        boolean z = d;
        Cursor cursor = null;
        Object map = null;
        cursor = null;
        try {
            try {
                SqlCommand sqlCommandSanitizeForQuery = sqlCommand.sanitizeForQuery();
                Cursor cursorRawQuery = aVar.d().rawQuery(sqlCommandSanitizeForQuery.getSql(), sqlCommandSanitizeForQuery.getQuerySqlArguments());
                ArrayList arrayList2 = null;
                int columnCount = 0;
                while (cursorRawQuery.moveToNext()) {
                    try {
                        if (z) {
                            Map<String, Object> mapM = m(cursorRawQuery);
                            if (LogLevel.b(aVar.d)) {
                                Log.d(Constant.TAG, aVar.e() + O(mapM));
                            }
                            arrayList.add(mapM);
                        } else {
                            if (map == null) {
                                ArrayList arrayList3 = new ArrayList();
                                HashMap map2 = new HashMap();
                                columnCount = cursorRawQuery.getColumnCount();
                                map2.put("columns", Arrays.asList(cursorRawQuery.getColumnNames()));
                                map2.put("rows", arrayList3);
                                arrayList2 = arrayList3;
                                map = map2;
                            }
                            arrayList2.add(l(cursorRawQuery, columnCount));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = cursorRawQuery;
                        w(e, operation, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (z) {
                    operation.success(arrayList);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    operation.success(map);
                }
                cursorRawQuery.close();
                return true;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String O(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof byte[])) {
            return obj instanceof Map ? r((Map) obj).toString() : obj.toString();
        }
        ArrayList arrayList = new ArrayList();
        for (byte b2 : (byte[]) obj) {
            arrayList.add(Integer.valueOf(b2));
        }
        return arrayList.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P(com.tekartik.sqflite.a aVar, Operation operation) throws Throwable {
        if (!q(aVar, operation)) {
            return false;
        }
        Cursor cursor = null;
        if (operation.getNoResult()) {
            operation.success(null);
            return true;
        }
        try {
            try {
                Cursor cursorRawQuery = aVar.g().rawQuery("SELECT changes()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            int i2 = cursorRawQuery.getInt(0);
                            if (LogLevel.b(aVar.d)) {
                                Log.d(Constant.TAG, aVar.e() + "changed " + i2);
                            }
                            operation.success(Integer.valueOf(i2));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cursor = cursorRawQuery;
                        w(e, operation, aVar);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.e(Constant.TAG, aVar.e() + "fail to read changes for Update/Delete");
                operation.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(com.tekartik.sqflite.a aVar) {
        try {
            if (LogLevel.b(aVar.d)) {
                Log.d(Constant.TAG, aVar.e() + "closing database " + k);
            }
            aVar.a();
        } catch (Exception e2) {
            Log.e(Constant.TAG, "error " + e2 + " while closing database " + j);
        }
        synchronized (g) {
            if (m.isEmpty() && l != null) {
                if (LogLevel.b(aVar.d)) {
                    Log.d(Constant.TAG, aVar.e() + "stopping thread" + k);
                }
                k.quit();
                k = null;
                l = null;
            }
        }
    }

    private static List<Object> l(Cursor cursor, int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            Object objN = n(cursor, i3);
            if (Debug.EXTRA_LOGV) {
                String name = null;
                if (objN != null) {
                    name = objN.getClass().isArray() ? "array(" + objN.getClass().getComponentType().getName() + ")" : objN.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i3);
                sb.append(" ");
                sb.append(cursor.getType(i3));
                sb.append(": ");
                sb.append(objN);
                sb.append(name == null ? "" : " (" + name + ")");
                Log.d(Constant.TAG, sb.toString());
            }
            arrayList.add(objN);
        }
        return arrayList;
    }

    private static Map<String, Object> m(Cursor cursor) {
        HashMap map = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Debug.EXTRA_LOGV) {
                Log.d(Constant.TAG, "column " + i2 + " " + cursor.getType(i2));
            }
            int type = cursor.getType(i2);
            if (type == 0) {
                map.put(columnNames[i2], null);
            } else if (type == 1) {
                map.put(columnNames[i2], Long.valueOf(cursor.getLong(i2)));
            } else if (type == 2) {
                map.put(columnNames[i2], Double.valueOf(cursor.getDouble(i2)));
            } else if (type == 3) {
                map.put(columnNames[i2], cursor.getString(i2));
            } else if (type == 4) {
                map.put(columnNames[i2], cursor.getBlob(i2));
            }
        }
        return map;
    }

    private static Object n(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(com.tekartik.sqflite.a aVar, Operation operation) {
        if (!q(aVar, operation)) {
            return false;
        }
        operation.success(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tekartik.sqflite.a p(com.tekartik.sqflite.a aVar, MethodCall methodCall, MethodChannel.Result result) {
        if (q(aVar, new ExecuteOperation(result, v(methodCall), (Boolean) methodCall.argument(Constant.PARAM_IN_TRANSACTION)))) {
            return aVar;
        }
        return null;
    }

    private boolean q(com.tekartik.sqflite.a aVar, Operation operation) {
        SqlCommand sqlCommand = operation.getSqlCommand();
        if (LogLevel.b(aVar.d)) {
            Log.d(Constant.TAG, aVar.e() + sqlCommand);
        }
        Boolean inTransaction = operation.getInTransaction();
        try {
            aVar.g().execSQL(sqlCommand.getSql(), sqlCommand.getSqlArguments());
            if (Boolean.TRUE.equals(inTransaction)) {
                aVar.f = true;
            }
            return true;
        } catch (Exception e2) {
            w(e2, operation, aVar);
            return false;
        } finally {
            if (Boolean.FALSE.equals(inTransaction)) {
                aVar.f = false;
            }
        }
    }

    private static Map<String, Object> r(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            map2.put(O(entry.getKey()), value instanceof Map ? r((Map) value) : O(value));
        }
        return map2;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new SqflitePlugin().A(registrar.context(), registrar.messenger());
    }

    private Context s() {
        return this.a;
    }

    private com.tekartik.sqflite.a t(int i2) {
        return m.get(Integer.valueOf(i2));
    }

    private com.tekartik.sqflite.a u(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        com.tekartik.sqflite.a aVarT = t(iIntValue);
        if (aVarT != null) {
            return aVarT;
        }
        result.error(Constant.k, "database_closed " + iIntValue, null);
        return null;
    }

    private SqlCommand v(MethodCall methodCall) {
        return new SqlCommand((String) methodCall.argument(Constant.PARAM_SQL), (List) methodCall.argument(Constant.PARAM_SQL_ARGUMENTS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Exception exc, Operation operation, com.tekartik.sqflite.a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            operation.error(Constant.k, "open_failed " + aVar.b, null);
            return;
        }
        if (exc instanceof SQLException) {
            operation.error(Constant.k, exc.getMessage(), SqlErrorInfo.getMap(operation));
        } else {
            operation.error(Constant.k, exc.getMessage(), SqlErrorInfo.getMap(operation));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean x(com.tekartik.sqflite.a aVar, Operation operation) throws Throwable {
        Exception e2;
        Cursor cursorRawQuery;
        if (!q(aVar, operation)) {
            return false;
        }
        CursorWrapper cursorWrapper = 0;
        if (operation.getNoResult()) {
            operation.success(null);
            return true;
        }
        try {
            try {
                cursorRawQuery = aVar.g().rawQuery("SELECT changes(), last_insert_rowid()", null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                            if (cursorRawQuery.getInt(0) == 0) {
                                if (LogLevel.b(aVar.d)) {
                                    Log.d(Constant.TAG, aVar.e() + "no changes (id was " + cursorRawQuery.getLong(1) + ")");
                                }
                                operation.success(null);
                                cursorRawQuery.close();
                                return true;
                            }
                            long j2 = cursorRawQuery.getLong(1);
                            if (LogLevel.b(aVar.d)) {
                                Log.d(Constant.TAG, aVar.e() + "inserted " + j2);
                            }
                            operation.success(Long.valueOf(j2));
                            cursorRawQuery.close();
                            return true;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        w(e2, operation, aVar);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return false;
                    }
                }
                Log.e(Constant.TAG, aVar.e() + "fail to read changes for Insert");
                operation.success(null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return true;
            } catch (Throwable th) {
                th = th;
                cursorWrapper = "SELECT changes(), last_insert_rowid()";
                if (cursorWrapper != 0) {
                    cursorWrapper.close();
                }
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursorWrapper != 0) {
                cursorWrapper.close();
            }
            throw th;
        }
    }

    public static boolean y(String str) {
        return str == null || str.equals(Constant.o);
    }

    public static Map z(int i2, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i2));
        if (z) {
            map.put(Constant.PARAM_RECOVERED, Boolean.TRUE);
        }
        if (z2) {
            map.put(Constant.PARAM_RECOVERED_IN_TRANSACTION, Boolean.TRUE);
        }
        return map;
    }

    public void H(MethodCall methodCall, MethodChannel.Result result) {
        if (i == null) {
            i = this.a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(i);
    }

    public void K(MethodCall methodCall, MethodChannel.Result result) {
        Object objArgument = methodCall.argument(Constant.f);
        if (objArgument != null) {
            d = Boolean.TRUE.equals(objArgument);
        }
        Object objArgument2 = methodCall.argument(Constant.g);
        if (objArgument2 != null) {
            e = ((Integer) objArgument2).intValue();
        }
        Integer numA = LogLevel.a(methodCall);
        if (numA != null) {
            f = numA.intValue();
        }
        result.success(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        A(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.a = null;
        this.b.setMethodCallHandler(null);
        this.b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "execute":
                G(methodCall, result);
                break;
            case "closeDatabase":
                C(methodCall, result);
                break;
            case "options":
                K(methodCall, result);
                break;
            case "insert":
                I(methodCall, result);
                break;
            case "update":
                M(methodCall, result);
                break;
            case "deleteDatabase":
                F(methodCall, result);
                break;
            case "debugMode":
                E(methodCall, result);
                break;
            case "openDatabase":
                J(methodCall, result);
                break;
            case "batch":
                B(methodCall, result);
                break;
            case "debug":
                D(methodCall, result);
                break;
            case "query":
                L(methodCall, result);
                break;
            case "getPlatformVersion":
                result.success("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                H(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public SqflitePlugin(Context context) {
        this.a = context.getApplicationContext();
    }
}

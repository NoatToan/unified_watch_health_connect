package yi2;

import android.content.Context;
import android.database.Cursor;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyi2/l;", "Lyi2/o;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "calendar-os_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f197421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context.getContentResolver());
        context.getClass();
        this.f197421b = new String[]{"_id", "calendar_displayName", "calendar_color"};
    }

    public static ArrayList d(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            a.C3697a c3697a = new a.C3697a();
            c3697a.f197356a = o.b(cursor, "_id");
            c3697a.f197357b = o.b(cursor, "calendar_displayName");
            arrayList.add(new a(c3697a.f197356a, c3697a.f197357b, o.b(cursor, "calendar_color")));
        }
        return arrayList;
    }
}

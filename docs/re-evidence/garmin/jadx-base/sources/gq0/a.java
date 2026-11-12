package gq0;

import com.garmin.android.library.backgroundtaskmanagement.d;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lgq0/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "Ll20/a;", "contacts", "Lgq0/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;Ljava/util/List;Lgq0/a$a;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<l20.a> f78503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC1582a f78504j;

    /* JADX INFO: renamed from: gq0.a$a, reason: collision with other inner class name */
    public interface InterfaceC1582a {
        void a(ArrayList arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, List<l20.a> list, InterfaceC1582a interfaceC1582a) {
        super(bVar);
        bVar.getClass();
        list.getClass();
        this.f78503i = list;
        this.f78504j = interfaceC1582a;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        ArrayList arrayList;
        InterfaceC1582a interfaceC1582a = this.f78504j;
        if (interfaceC1582a != null) {
            List<l20.a> list = this.f78503i;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            for (l20.a aVar : list) {
                GDIIncidentDetectionProto.Contact.Builder builderNewBuilder = GDIIncidentDetectionProto.Contact.newBuilder();
                builderNewBuilder.setId(aVar.getContactId());
                String firstName = aVar.getFirstName();
                if (firstName == null) {
                    firstName = "";
                }
                String lastName = aVar.getLastName();
                builderNewBuilder.setName(w.i0(firstName + StringUtils.SPACE + (lastName != null ? lastName : "")).toString());
                List<l20.c> listZ = aVar.z();
                ArrayList arrayList3 = null;
                if (listZ != null) {
                    arrayList = new ArrayList(y.r(listZ, 10));
                    Iterator<T> it = listZ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((l20.c) it.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String());
                    }
                } else {
                    arrayList = null;
                }
                builderNewBuilder.addAllTelephone(arrayList);
                List<l20.c> listR = aVar.r();
                if (listR != null) {
                    arrayList3 = new ArrayList(y.r(listR, 10));
                    Iterator<T> it3 = listR.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((l20.c) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String());
                    }
                }
                builderNewBuilder.addAllEmailAddress(arrayList3);
                GDIIncidentDetectionProto.Contact contactBuild = builderNewBuilder.build();
                contactBuild.getClass();
                arrayList2.add(contactBuild);
            }
            interfaceC1582a.a(arrayList2);
        }
        c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }
}

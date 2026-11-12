package com.garmin.android.apps.connectmobile.social.conversationservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import b12.b;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(ConversationCommentTypeAdapter.class)
public class ConversationCommentDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<ConversationCommentDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f44549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f44550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f44554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f44556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f44557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f44558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f44559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f44561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<mo1.a> f44562q;

    public static class ConversationCommentTypeAdapter implements JsonDeserializer<ConversationCommentDTO>, JsonSerializer<ConversationCommentDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ConversationCommentDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
                conversationCommentDTO.k(new JSONObject(jsonElement.toString()));
                return conversationCommentDTO;
            } catch (Exception e4) {
                i2.g(e4, "ConversationCommentDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(ConversationCommentDTO conversationCommentDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return JsonParser.parseString(conversationCommentDTO.C());
            } catch (Exception e4) {
                i2.g(e4, "ConversationCommentDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ConversationCommentDTO> {
        @Override // android.os.Parcelable.Creator
        public final ConversationCommentDTO createFromParcel(Parcel parcel) {
            return new ConversationCommentDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ConversationCommentDTO[] newArray(int i14) {
            return new ConversationCommentDTO[i14];
        }
    }

    public ConversationCommentDTO(Parcel parcel) {
        this.f44559n = Boolean.FALSE;
        this.f44560o = false;
        b bVar = b.f14386g;
        this.f44561p = bVar;
        this.f44562q = new ArrayList();
        this.f44546a = parcel.readString();
        this.f44547b = parcel.readString();
        this.f44548c = parcel.readString();
        this.f44549d = (Date) parcel.readSerializable();
        this.f44550e = parcel.readString();
        this.f44551f = parcel.readString();
        this.f44552g = parcel.readString();
        this.f44553h = parcel.readInt() == 1;
        this.f44554i = (String[]) parcel.readArray(String.class.getClassLoader());
        this.f44555j = parcel.readString();
        this.f44556k = parcel.readInt() == 1;
        this.f44557l = parcel.readInt();
        this.f44558m = parcel.readString();
        this.f44559n = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f44562q = arrayList;
        parcel.readTypedList(arrayList, mo1.a.CREATOR);
        b bVar2 = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f44561p = bVar2 != null ? bVar2 : bVar;
    }

    public final String C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("conversationCommentUuid", this.f44546a);
        jSONObject.put("conversationUuid", this.f44547b);
        jSONObject.put("conversationCommentPk", this.f44548c);
        Date date = this.f44549d;
        jSONObject.put("createDate", date == null ? null : Long.valueOf(date.getTime() / 1000));
        jSONObject.put("authorDisplayName", this.f44550e);
        jSONObject.put("authorFullName", this.f44551f);
        jSONObject.put("authorImageUrl", this.f44552g);
        if (this.f44554i != null) {
            JSONArray jSONArray = new JSONArray();
            int i14 = 0;
            while (true) {
                String[] strArr = this.f44554i;
                if (i14 >= strArr.length) {
                    break;
                }
                String str = strArr[i14];
                if (str != null) {
                    jSONArray.put(str);
                }
                i14++;
            }
            jSONObject.put("authorRoles", jSONArray);
        } else {
            jSONObject.put("authorRoles", (Object) null);
        }
        jSONObject.put("authorPro", this.f44553h);
        jSONObject.put(TtmlNode.TAG_BODY, this.f44555j);
        jSONObject.put("likedByUser", this.f44556k);
        jSONObject.put("numberOfLikes", this.f44557l);
        jSONObject.put("userProfilePk", this.f44558m);
        Boolean bool = this.f44559n;
        if (bool != null) {
            jSONObject.put("updated", bool);
        }
        List<mo1.a> list = this.f44562q;
        mo1.a.f119873e.getClass();
        list.getClass();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(((mo1.a) it.next()).G());
        }
        jSONObject.put("commentBlockList", jSONArray2);
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f44546a = s1.u(jSONObject, "conversationCommentUuid");
            this.f44547b = s1.u(jSONObject, "conversationUuid");
            this.f44548c = s1.u(jSONObject, "conversationCommentPk");
            this.f44549d = new Date(jSONObject.optLong("createDate"));
            this.f44550e = s1.u(jSONObject, "authorDisplayName");
            this.f44551f = s1.u(jSONObject, "authorFullName");
            this.f44552g = s1.u(jSONObject, "authorImageUrl");
            this.f44553h = jSONObject.optBoolean("authorPro");
            List<String> listY = s1.y(jSONObject, "authorRoles");
            if (listY != null) {
                this.f44554i = new String[listY.size()];
                for (int i14 = 0; i14 < listY.size(); i14++) {
                    this.f44554i[i14] = listY.get(i14);
                }
            }
            this.f44555j = s1.u(jSONObject, TtmlNode.TAG_BODY);
            this.f44556k = jSONObject.optBoolean("likedByUser");
            this.f44557l = jSONObject.getInt("numberOfLikes");
            this.f44558m = s1.u(jSONObject, "userProfilePk");
            this.f44559n = Boolean.valueOf(jSONObject.optBoolean("updated"));
            this.f44562q = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("commentBlockList");
            if (jSONArrayOptJSONArray != null) {
                mo1.a.f119873e.getClass();
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i15 = 0; i15 < length; i15++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i15);
                    mo1.a aVar = new mo1.a(null, null, null, null, 15, null);
                    aVar.k(jSONObject2);
                    arrayList.add(aVar);
                }
                this.f44562q = arrayList;
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConversationCommentDTO [uuid=");
        sb3.append(this.f44546a);
        sb3.append(", conversationUuid=");
        sb3.append(this.f44547b);
        sb3.append(", conversationCommentPk=");
        sb3.append(this.f44548c);
        sb3.append(", createDate=");
        sb3.append(this.f44549d);
        sb3.append(", authorDisplayName=");
        sb3.append(this.f44550e);
        sb3.append(", authorFullName=");
        sb3.append(this.f44551f);
        sb3.append(", authorImageUrl=");
        sb3.append(this.f44552g);
        sb3.append(", authorPro=");
        sb3.append(this.f44553h);
        sb3.append(", authorRoles=");
        sb3.append(Arrays.toString(this.f44554i));
        sb3.append(", body=");
        sb3.append(this.f44555j);
        sb3.append(", likedByUser=");
        sb3.append(this.f44556k);
        sb3.append(", numberOfLikes=");
        sb3.append(this.f44557l);
        sb3.append(", userProfilePk=");
        sb3.append(this.f44558m);
        sb3.append(", updated=");
        sb3.append(this.f44559n);
        sb3.append(", commentBlockDTOList=");
        return z.c(sb3, this.f44562q, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f44546a);
        parcel.writeString(this.f44547b);
        parcel.writeString(this.f44548c);
        parcel.writeSerializable(this.f44549d);
        parcel.writeString(this.f44550e);
        parcel.writeString(this.f44551f);
        parcel.writeString(this.f44552g);
        parcel.writeInt(this.f44553h ? 1 : 0);
        parcel.writeArray(this.f44554i);
        parcel.writeString(this.f44555j);
        parcel.writeInt(this.f44556k ? 1 : 0);
        parcel.writeInt(this.f44557l);
        parcel.writeString(this.f44558m);
        parcel.writeValue(this.f44559n);
        parcel.writeTypedList(this.f44562q);
        parcel.writeParcelable(this.f44561p, i14);
    }

    public ConversationCommentDTO(String str, String str2, String str3, Date date, String str4, String str5, String str6, boolean z14, String[] strArr, String str7, boolean z15, int i14, String str8, boolean z16, List<mo1.a> list) {
        this.f44559n = Boolean.FALSE;
        this.f44560o = false;
        this.f44561p = b.f14386g;
        this.f44562q = new ArrayList();
        this.f44546a = str;
        this.f44547b = str2;
        this.f44548c = str3;
        this.f44549d = date;
        this.f44550e = str4;
        this.f44551f = str5;
        this.f44552g = str6;
        this.f44553h = z14;
        this.f44554i = strArr;
        this.f44555j = str7;
        this.f44556k = z15;
        this.f44557l = i14;
        this.f44558m = str8;
        this.f44559n = Boolean.valueOf(z16);
        this.f44562q = list != null ? list : new ArrayList<>();
    }

    public ConversationCommentDTO() {
        this.f44559n = Boolean.FALSE;
        this.f44560o = false;
        this.f44561p = b.f14386g;
        this.f44562q = new ArrayList();
    }
}

package com.facebook.share;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.CollectionMapper;
import com.facebook.internal.Mutable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.VideoUploader;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareApi {
    private static final String d = "ShareApi";
    private static final String e = "me";
    private static final String f = "photos";
    private static final String g = "%s/%s";
    private static final String h = "UTF-8";
    private String a;
    private String b = "me";
    private final ShareContent c;

    public class a implements GraphRequest.Callback {
        public final /* synthetic */ CollectionMapper.OnMapValueCompleteListener a;

        public a(CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
            this.a = onMapValueCompleteListener;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                String errorMessage = error.getErrorMessage();
                this.a.onError(new FacebookGraphResponseException(graphResponse, errorMessage != null ? errorMessage : "Error staging Open Graph object."));
                return;
            }
            JSONObject graphObject = graphResponse.getGraphObject();
            if (graphObject == null) {
                this.a.onError(new FacebookGraphResponseException(graphResponse, "Error staging Open Graph object."));
                return;
            }
            String strOptString = graphObject.optString("id");
            if (strOptString == null) {
                this.a.onError(new FacebookGraphResponseException(graphResponse, "Error staging Open Graph object."));
            } else {
                this.a.onComplete(strOptString);
            }
        }
    }

    public class b implements CollectionMapper.OnMapperCompleteListener {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ String b;
        public final /* synthetic */ GraphRequest.Callback c;
        public final /* synthetic */ CollectionMapper.OnMapValueCompleteListener d;

        public b(JSONObject jSONObject, String str, GraphRequest.Callback callback, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
            this.a = jSONObject;
            this.b = str;
            this.c = callback;
            this.d = onMapValueCompleteListener;
        }

        @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
        public void onComplete() {
            String string = this.a.toString();
            Bundle bundle = new Bundle();
            bundle.putString("object", string);
            try {
                new GraphRequest(AccessToken.getCurrentAccessToken(), ShareApi.b(ShareApi.this, "objects/" + URLEncoder.encode(this.b, "UTF-8")), bundle, HttpMethod.POST, this.c).executeAsync();
            } catch (UnsupportedEncodingException e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging Open Graph object.";
                }
                this.d.onError(new FacebookException(localizedMessage));
            }
        }

        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            this.d.onError(facebookException);
        }
    }

    public class c implements GraphRequest.Callback {
        public final /* synthetic */ CollectionMapper.OnMapValueCompleteListener a;
        public final /* synthetic */ SharePhoto b;

        public c(CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener, SharePhoto sharePhoto) {
            this.a = onMapValueCompleteListener;
            this.b = sharePhoto;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            FacebookRequestError error = graphResponse.getError();
            if (error != null) {
                String errorMessage = error.getErrorMessage();
                this.a.onError(new FacebookGraphResponseException(graphResponse, errorMessage != null ? errorMessage : "Error staging photo."));
                return;
            }
            JSONObject graphObject = graphResponse.getGraphObject();
            if (graphObject == null) {
                this.a.onError(new FacebookException("Error staging photo."));
                return;
            }
            String strOptString = graphObject.optString("uri");
            if (strOptString == null) {
                this.a.onError(new FacebookException("Error staging photo."));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", strOptString);
                jSONObject.put(NativeProtocol.IMAGE_USER_GENERATED_KEY, this.b.getUserGenerated());
                this.a.onComplete(jSONObject);
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                this.a.onError(new FacebookException(localizedMessage != null ? localizedMessage : "Error staging photo."));
            }
        }
    }

    public class d implements GraphRequest.Callback {
        public final /* synthetic */ FacebookCallback a;

        public d(FacebookCallback facebookCallback) {
            this.a = facebookCallback;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            JSONObject graphObject = graphResponse.getGraphObject();
            ShareInternalUtility.invokeCallbackWithResults(this.a, graphObject == null ? null : graphObject.optString("id"), graphResponse);
        }
    }

    public class e implements CollectionMapper.OnMapperCompleteListener {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ ShareOpenGraphAction b;
        public final /* synthetic */ GraphRequest.Callback c;
        public final /* synthetic */ FacebookCallback d;

        public e(Bundle bundle, ShareOpenGraphAction shareOpenGraphAction, GraphRequest.Callback callback, FacebookCallback facebookCallback) {
            this.a = bundle;
            this.b = shareOpenGraphAction;
            this.c = callback;
            this.d = facebookCallback;
        }

        @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
        public void onComplete() {
            try {
                ShareApi.a(this.a);
                new GraphRequest(AccessToken.getCurrentAccessToken(), ShareApi.b(ShareApi.this, URLEncoder.encode(this.b.getActionType(), "UTF-8")), this.a, HttpMethod.POST, this.c).executeAsync();
            } catch (UnsupportedEncodingException e) {
                ShareInternalUtility.invokeCallbackWithException(this.d, e);
            }
        }

        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            ShareInternalUtility.invokeCallbackWithException(this.d, facebookException);
        }
    }

    public class f implements GraphRequest.Callback {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Mutable c;
        public final /* synthetic */ FacebookCallback d;

        public f(ArrayList arrayList, ArrayList arrayList2, Mutable mutable, FacebookCallback facebookCallback) {
            this.a = arrayList;
            this.b = arrayList2;
            this.c = mutable;
            this.d = facebookCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            JSONObject graphObject = graphResponse.getGraphObject();
            if (graphObject != null) {
                this.a.add(graphObject);
            }
            if (graphResponse.getError() != null) {
                this.b.add(graphResponse);
            }
            Mutable mutable = this.c;
            mutable.value = Integer.valueOf(((Integer) mutable.value).intValue() - 1);
            if (((Integer) this.c.value).intValue() == 0) {
                if (!this.b.isEmpty()) {
                    ShareInternalUtility.invokeCallbackWithResults(this.d, null, (GraphResponse) this.b.get(0));
                } else {
                    if (this.a.isEmpty()) {
                        return;
                    }
                    ShareInternalUtility.invokeCallbackWithResults(this.d, ((JSONObject) this.a.get(0)).optString("id"), graphResponse);
                }
            }
        }
    }

    public class g implements GraphRequest.Callback {
        public final /* synthetic */ FacebookCallback a;

        public g(FacebookCallback facebookCallback) {
            this.a = facebookCallback;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            JSONObject graphObject = graphResponse.getGraphObject();
            ShareInternalUtility.invokeCallbackWithResults(this.a, graphObject == null ? null : graphObject.optString("id"), graphResponse);
        }
    }

    public class h implements CollectionMapper.Collection<Integer> {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ JSONArray b;

        public class a implements Iterator<Integer> {
            public final /* synthetic */ Mutable a;
            public final /* synthetic */ int b;

            public a(Mutable mutable, int i) {
                this.a = mutable;
                this.b = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Integer] */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer next() {
                Mutable mutable = this.a;
                T t = mutable.value;
                Integer num = (Integer) t;
                mutable.value = Integer.valueOf(((Integer) t).intValue() + 1);
                return num;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public boolean hasNext() {
                return ((Integer) this.a.value).intValue() < this.b;
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public h(ArrayList arrayList, JSONArray jSONArray) {
            this.a = arrayList;
            this.b = jSONArray;
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object get(Integer num) {
            return this.a.get(num.intValue());
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Integer num, Object obj, CollectionMapper.OnErrorListener onErrorListener) {
            try {
                this.b.put(num.intValue(), obj);
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging object.";
                }
                onErrorListener.onError(new FacebookException(localizedMessage));
            }
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        public Iterator<Integer> keyIterator() {
            return new a(new Mutable(0), this.a.size());
        }
    }

    public class i implements CollectionMapper.OnMapperCompleteListener {
        public final /* synthetic */ CollectionMapper.OnMapValueCompleteListener a;
        public final /* synthetic */ JSONArray b;

        public i(CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener, JSONArray jSONArray) {
            this.a = onMapValueCompleteListener;
            this.b = jSONArray;
        }

        @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
        public void onComplete() {
            this.a.onComplete(this.b);
        }

        @Override // com.facebook.internal.CollectionMapper.OnErrorListener
        public void onError(FacebookException facebookException) {
            this.a.onError(facebookException);
        }
    }

    public class j implements CollectionMapper.ValueMapper {
        public j() {
        }

        @Override // com.facebook.internal.CollectionMapper.ValueMapper
        public void mapValue(Object obj, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
            if (obj instanceof ArrayList) {
                ShareApi.c(ShareApi.this, (ArrayList) obj, onMapValueCompleteListener);
                return;
            }
            if (obj instanceof ShareOpenGraphObject) {
                ShareApi.d(ShareApi.this, (ShareOpenGraphObject) obj, onMapValueCompleteListener);
            } else if (obj instanceof SharePhoto) {
                ShareApi.e(ShareApi.this, (SharePhoto) obj, onMapValueCompleteListener);
            } else {
                onMapValueCompleteListener.onComplete(obj);
            }
        }
    }

    public class k implements CollectionMapper.Collection<String> {
        public final /* synthetic */ Bundle a;

        public k(Bundle bundle) {
            this.a = bundle;
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object get(String str) {
            return this.a.get(str);
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(String str, Object obj, CollectionMapper.OnErrorListener onErrorListener) {
            if (Utility.putJSONValueInBundle(this.a, str, obj)) {
                return;
            }
            onErrorListener.onError(new FacebookException("Unexpected value: " + obj.toString()));
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        public Iterator<String> keyIterator() {
            return this.a.keySet().iterator();
        }
    }

    public class l implements CollectionMapper.Collection<String> {
        public final /* synthetic */ ShareOpenGraphObject a;
        public final /* synthetic */ JSONObject b;

        public l(ShareOpenGraphObject shareOpenGraphObject, JSONObject jSONObject) {
            this.a = shareOpenGraphObject;
            this.b = jSONObject;
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object get(String str) {
            return this.a.get(str);
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(String str, Object obj, CollectionMapper.OnErrorListener onErrorListener) {
            try {
                this.b.put(str, obj);
            } catch (JSONException e) {
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging object.";
                }
                onErrorListener.onError(new FacebookException(localizedMessage));
            }
        }

        @Override // com.facebook.internal.CollectionMapper.Collection
        public Iterator<String> keyIterator() {
            return this.a.keySet().iterator();
        }
    }

    public ShareApi(ShareContent shareContent) {
        this.c = shareContent;
    }

    public static /* synthetic */ void a(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            i(bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    public static /* synthetic */ String b(ShareApi shareApi, String str) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return null;
        }
        try {
            return shareApi.g(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
            return null;
        }
    }

    public static /* synthetic */ void c(ShareApi shareApi, ArrayList arrayList, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            shareApi.o(arrayList, onMapValueCompleteListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    public static /* synthetic */ void d(ShareApi shareApi, ShareOpenGraphObject shareOpenGraphObject, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            shareApi.r(shareOpenGraphObject, onMapValueCompleteListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    public static /* synthetic */ void e(ShareApi shareApi, SharePhoto sharePhoto, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            shareApi.s(sharePhoto, onMapValueCompleteListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    private void f(Bundle bundle, ShareContent shareContent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            List<String> peopleIds = shareContent.getPeopleIds();
            if (!Utility.isNullOrEmpty(peopleIds)) {
                bundle.putString("tags", TextUtils.join(", ", peopleIds));
            }
            if (!Utility.isNullOrEmpty(shareContent.getPlaceId())) {
                bundle.putString("place", shareContent.getPlaceId());
            }
            if (!Utility.isNullOrEmpty(shareContent.getPageId())) {
                bundle.putString(DTransferConstants.PAGE, shareContent.getPageId());
            }
            if (Utility.isNullOrEmpty(shareContent.getRef())) {
                return;
            }
            bundle.putString("ref", shareContent.getRef());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private String g(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return String.format(Locale.ROOT, g, URLEncoder.encode(getGraphNode(), "UTF-8"), str);
        } catch (UnsupportedEncodingException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private Bundle h(SharePhoto sharePhoto, SharePhotoContent sharePhotoContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Bundle parameters = sharePhoto.getParameters();
            if (!parameters.containsKey("place") && !Utility.isNullOrEmpty(sharePhotoContent.getPlaceId())) {
                parameters.putString("place", sharePhotoContent.getPlaceId());
            }
            if (!parameters.containsKey("tags") && !Utility.isNullOrEmpty(sharePhotoContent.getPeopleIds())) {
                List<String> peopleIds = sharePhotoContent.getPeopleIds();
                if (!Utility.isNullOrEmpty(peopleIds)) {
                    JSONArray jSONArray = new JSONArray();
                    for (String str : peopleIds) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("tag_uid", str);
                        jSONArray.put(jSONObject);
                    }
                    parameters.putString("tags", jSONArray.toString());
                }
            }
            if (!parameters.containsKey("ref") && !Utility.isNullOrEmpty(sharePhotoContent.getRef())) {
                parameters.putString("ref", sharePhotoContent.getRef());
            }
            return parameters;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private static void i(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            String string = bundle.getString("image");
            if (string != null) {
                try {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                j(bundle, i2, jSONObjectOptJSONObject);
                            } else {
                                bundle.putString(String.format(Locale.ROOT, "image[%d][url]", Integer.valueOf(i2)), jSONArray.getString(i2));
                            }
                        }
                        bundle.remove("image");
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    j(bundle, 0, new JSONObject(string));
                    bundle.remove("image");
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    private static void j(Bundle bundle, int i2, JSONObject jSONObject) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(String.format(Locale.ROOT, "image[%d][%s]", Integer.valueOf(i2), next), jSONObject.get(next).toString());
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    private void k(ShareLinkContent shareLinkContent, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            g gVar = new g(facebookCallback);
            Bundle bundle = new Bundle();
            f(bundle, shareLinkContent);
            bundle.putString("message", getMessage());
            bundle.putString("link", Utility.getUriString(shareLinkContent.getContentUrl()));
            bundle.putString("picture", Utility.getUriString(shareLinkContent.getImageUrl()));
            bundle.putString("name", shareLinkContent.getContentTitle());
            bundle.putString("description", shareLinkContent.getContentDescription());
            bundle.putString("ref", shareLinkContent.getRef());
            new GraphRequest(AccessToken.getCurrentAccessToken(), g("feed"), bundle, HttpMethod.POST, gVar).executeAsync();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void l(ShareOpenGraphContent shareOpenGraphContent, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            d dVar = new d(facebookCallback);
            ShareOpenGraphAction action = shareOpenGraphContent.getAction();
            Bundle bundle = action.getBundle();
            f(bundle, shareOpenGraphContent);
            if (!Utility.isNullOrEmpty(getMessage())) {
                bundle.putString("message", getMessage());
            }
            q(bundle, new e(bundle, action, dVar, facebookCallback));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [T, java.lang.Integer] */
    private void m(SharePhotoContent sharePhotoContent, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Mutable mutable = new Mutable(0);
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            ArrayList arrayList = new ArrayList();
            f fVar = new f(new ArrayList(), new ArrayList(), mutable, facebookCallback);
            try {
                for (SharePhoto sharePhoto : sharePhotoContent.getPhotos()) {
                    try {
                        Bundle bundleH = h(sharePhoto, sharePhotoContent);
                        Bitmap bitmap = sharePhoto.getBitmap();
                        Uri imageUrl = sharePhoto.getImageUrl();
                        String caption = sharePhoto.getCaption();
                        if (caption == null) {
                            caption = getMessage();
                        }
                        String str = caption;
                        if (bitmap != null) {
                            arrayList.add(GraphRequest.newUploadPhotoRequest(currentAccessToken, g(f), bitmap, str, bundleH, fVar));
                        } else if (imageUrl != null) {
                            arrayList.add(GraphRequest.newUploadPhotoRequest(currentAccessToken, g(f), imageUrl, str, bundleH, fVar));
                        }
                    } catch (JSONException e2) {
                        ShareInternalUtility.invokeCallbackWithException(facebookCallback, e2);
                        return;
                    }
                }
                mutable.value = Integer.valueOf(((Integer) mutable.value).intValue() + arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((GraphRequest) it2.next()).executeAsync();
                }
            } catch (FileNotFoundException e3) {
                ShareInternalUtility.invokeCallbackWithException(facebookCallback, e3);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void n(ShareVideoContent shareVideoContent, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            try {
                VideoUploader.uploadAsync(shareVideoContent, getGraphNode(), facebookCallback);
            } catch (FileNotFoundException e2) {
                ShareInternalUtility.invokeCallbackWithException(facebookCallback, e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void o(ArrayList arrayList, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            p(new h(arrayList, jSONArray), new i(onMapValueCompleteListener, jSONArray));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private <T> void p(CollectionMapper.Collection<T> collection, CollectionMapper.OnMapperCompleteListener onMapperCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            CollectionMapper.iterate(collection, new j(), onMapperCompleteListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void q(Bundle bundle, CollectionMapper.OnMapperCompleteListener onMapperCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            p(new k(bundle), onMapperCompleteListener);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void r(ShareOpenGraphObject shareOpenGraphObject, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String string = shareOpenGraphObject.getString("type");
            if (string == null) {
                string = shareOpenGraphObject.getString("og:type");
            }
            String str = string;
            if (str == null) {
                onMapValueCompleteListener.onError(new FacebookException("Open Graph objects must contain a type value."));
            } else {
                JSONObject jSONObject = new JSONObject();
                p(new l(shareOpenGraphObject, jSONObject), new b(jSONObject, str, new a(onMapValueCompleteListener), onMapValueCompleteListener));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private void s(SharePhoto sharePhoto, CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Bitmap bitmap = sharePhoto.getBitmap();
            Uri imageUrl = sharePhoto.getImageUrl();
            if (bitmap == null && imageUrl == null) {
                onMapValueCompleteListener.onError(new FacebookException("Photos must have an imageURL or bitmap."));
                return;
            }
            c cVar = new c(onMapValueCompleteListener, sharePhoto);
            if (bitmap != null) {
                ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), bitmap, cVar).executeAsync();
                return;
            }
            try {
                ShareInternalUtility.newUploadStagingResourceWithImageRequest(AccessToken.getCurrentAccessToken(), imageUrl, cVar).executeAsync();
            } catch (FileNotFoundException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Error staging photo.";
                }
                onMapValueCompleteListener.onError(new FacebookException(localizedMessage));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static void share(ShareContent shareContent, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(ShareApi.class)) {
            return;
        }
        try {
            new ShareApi(shareContent).share(facebookCallback);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareApi.class);
        }
    }

    public boolean canShare() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (getShareContent() == null) {
                return false;
            }
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (!AccessToken.isCurrentAccessTokenActive()) {
                return false;
            }
            Set<String> permissions = currentAccessToken.getPermissions();
            if (permissions != null && permissions.contains("publish_actions")) {
                return true;
            }
            Log.w(d, "The publish_actions permissions are missing, the share will fail unless this app was authorized to publish in another installation.");
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public String getGraphNode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public String getMessage() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public ShareContent getShareContent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.c;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public void setGraphNode(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.b = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void setMessage(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.a = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public void share(FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!canShare()) {
                ShareInternalUtility.invokeCallbackWithError(facebookCallback, "Insufficient permissions for sharing content via Api.");
                return;
            }
            ShareContent shareContent = getShareContent();
            try {
                ShareContentValidation.validateForApiShare(shareContent);
                if (shareContent instanceof ShareLinkContent) {
                    k((ShareLinkContent) shareContent, facebookCallback);
                    return;
                }
                if (shareContent instanceof SharePhotoContent) {
                    m((SharePhotoContent) shareContent, facebookCallback);
                } else if (shareContent instanceof ShareVideoContent) {
                    n((ShareVideoContent) shareContent, facebookCallback);
                } else if (shareContent instanceof ShareOpenGraphContent) {
                    l((ShareOpenGraphContent) shareContent, facebookCallback);
                }
            } catch (FacebookException e2) {
                ShareInternalUtility.invokeCallbackWithException(facebookCallback, e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}

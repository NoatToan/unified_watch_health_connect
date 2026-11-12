package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class a5d {
    public static int a(String str) {
        str.hashCode();
        switch (str) {
            case "BitmapMemoryCacheGetProducer":
            case "BitmapMemoryCacheProducer":
                return 5;
            case "LocalResourceFetchProducer":
            case "LocalFileFetchProducer":
            case "LocalAssetFetchProducer":
            case "DataFetchProducer":
            case "LocalContentUriThumbnailFetchProducer":
            case "LocalContentUriFetchProducer":
                return 6;
            case "EncodedMemoryCacheProducer":
                return 4;
            case "NetworkFetchProducer":
                return 2;
            case "DiskCacheProducer":
                return 3;
            default:
                return 1;
        }
    }

    public static String b(int i) {
        if (i == 2) {
            return "network";
        }
        if (i == 3) {
            return "disk";
        }
        if (i == 4) {
            return "memory_encoded";
        }
        if (i != 5) {
            return i != 6 ? "unknown" : "local";
        }
        return "memory_bitmap";
    }
}

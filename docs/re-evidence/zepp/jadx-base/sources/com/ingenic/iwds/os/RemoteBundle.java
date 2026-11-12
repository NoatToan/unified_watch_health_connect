package com.ingenic.iwds.os;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.ingenic.iwds.content.RemoteIntent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteBundle implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RemoteBundle> CREATOR = new a();
    private Map<String, Object> a;

    public static class a implements Parcelable.Creator<RemoteBundle> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteBundle createFromParcel(Parcel parcel) {
            return new RemoteBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteBundle[] newArray(int i) {
            return new RemoteBundle[i];
        }
    }

    public RemoteBundle(RemoteBundle remoteBundle) {
        if (remoteBundle.a != null) {
            this.a = new HashMap(remoteBundle.a);
        }
    }

    public static RemoteBundle fromBunble(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new RemoteBundle(bundle);
    }

    public Object clone() {
        return new RemoteBundle(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle toBundle() {
        if (this.a == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<String> it2 = this.a.keySet().iterator();
        if (it2 != null) {
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = this.a.get(next);
                if (obj instanceof Byte) {
                    bundle.putByte(next, ((Byte) obj).byteValue());
                } else if (obj instanceof Short) {
                    bundle.putShort(next, ((Short) obj).shortValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(next, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Character) {
                    bundle.putChar(next, ((Character) obj).charValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof CharSequence) {
                    bundle.putCharSequence(next, (CharSequence) obj);
                } else if (obj instanceof RemoteBundle) {
                    bundle.putBundle(next, ((RemoteBundle) obj).toBundle());
                } else if (obj instanceof IBinder) {
                    bundle.putBinder(next, (IBinder) obj);
                } else if (obj instanceof byte[]) {
                    bundle.putByteArray(next, (byte[]) obj);
                } else if (obj instanceof short[]) {
                    bundle.putShortArray(next, (short[]) obj);
                } else if (obj instanceof int[]) {
                    bundle.putIntArray(next, (int[]) obj);
                } else if (obj instanceof long[]) {
                    bundle.putLongArray(next, (long[]) obj);
                } else if (obj instanceof float[]) {
                    bundle.putFloatArray(next, (float[]) obj);
                } else if (obj instanceof double[]) {
                    bundle.putDoubleArray(next, (double[]) obj);
                } else if (obj instanceof boolean[]) {
                    bundle.putBooleanArray(next, (boolean[]) obj);
                } else if (obj instanceof char[]) {
                    bundle.putCharArray(next, (char[]) obj);
                } else if (obj instanceof String[]) {
                    bundle.putStringArray(next, (String[]) obj);
                } else if (obj instanceof CharSequence[]) {
                    bundle.putCharSequenceArray(next, (CharSequence[]) obj);
                } else {
                    int i = 0;
                    if (obj instanceof ArrayList) {
                        if (obj != null) {
                            ArrayList<Integer> arrayList = (ArrayList) obj;
                            if (arrayList.size() > 0) {
                                Integer num = arrayList.get(0);
                                if (num instanceof Integer) {
                                    bundle.putIntegerArrayList(next, arrayList);
                                } else if (num instanceof String) {
                                    bundle.putStringArrayList(next, arrayList);
                                } else if (num instanceof CharSequence) {
                                    bundle.putCharSequenceArrayList(next, arrayList);
                                } else if (num instanceof Parcelable) {
                                    int size = arrayList.size();
                                    while (i < size) {
                                        Parcelable parcelable = (Parcelable) arrayList.get(i);
                                        if (parcelable instanceof RemoteBundle) {
                                            arrayList.set(i, ((RemoteBundle) parcelable).toBundle());
                                        } else if (parcelable instanceof RemoteIntent) {
                                            arrayList.set(i, ((RemoteIntent) parcelable).toIntent());
                                        }
                                        i++;
                                    }
                                    bundle.putParcelableArrayList(next, arrayList);
                                }
                            }
                        }
                    } else if (obj instanceof SparseArray) {
                        SparseArray<? extends Parcelable> sparseArray = (SparseArray) obj;
                        int size2 = sparseArray.size();
                        while (i < size2) {
                            int iKeyAt = sparseArray.keyAt(i);
                            Parcelable parcelable2 = (Parcelable) sparseArray.get(iKeyAt);
                            if (parcelable2 instanceof RemoteBundle) {
                                sparseArray.put(iKeyAt, ((RemoteBundle) parcelable2).toBundle());
                            } else if (parcelable2 instanceof RemoteIntent) {
                                sparseArray.put(iKeyAt, ((RemoteIntent) parcelable2).toIntent());
                            }
                            i++;
                        }
                        bundle.putSparseParcelableArray(next, sparseArray);
                    } else if (obj instanceof Parcelable) {
                        if (obj instanceof RemoteIntent) {
                            bundle.putParcelable(next, ((RemoteIntent) obj).toIntent());
                        } else {
                            bundle.putParcelable(next, (Parcelable) obj);
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(next, (Serializable) obj);
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        int length = parcelableArr.length;
                        while (i < length) {
                            Parcelable parcelable3 = parcelableArr[i];
                            if (parcelable3 instanceof RemoteBundle) {
                                parcelableArr[i] = ((RemoteBundle) parcelable3).toBundle();
                            } else if (parcelable3 instanceof RemoteIntent) {
                                parcelableArr[i] = ((RemoteIntent) parcelable3).toIntent();
                            }
                            i++;
                        }
                        bundle.putParcelableArray(next, parcelableArr);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Map<String, Object> map = this.a;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(map.size());
            parcel.writeMap(this.a);
        }
    }

    public RemoteBundle(Bundle bundle) {
        ArrayList arrayList;
        int size;
        Iterator<String> it2 = bundle.keySet().iterator();
        if (it2 == null) {
            return;
        }
        if (this.a == null) {
            this.a = new HashMap();
        }
        while (it2.hasNext()) {
            String next = it2.next();
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                this.a.put(next, fromBunble((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    int length = parcelableArr.length;
                    while (i < length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = fromBunble((Bundle) parcelable);
                        } else if (parcelable instanceof Intent) {
                            parcelableArr[i] = RemoteIntent.fromIntent((Intent) parcelable);
                        }
                        i++;
                    }
                } else if ((obj instanceof ArrayList) && obj != null && (size = (arrayList = (ArrayList) obj).size()) > 0) {
                    Object obj2 = arrayList.get(0);
                    if (obj2 instanceof Parcelable) {
                        while (i < size) {
                            Parcelable parcelable2 = (Parcelable) arrayList.get(i);
                            if (parcelable2 instanceof Bundle) {
                                arrayList.set(i, fromBunble((Bundle) obj2));
                            } else if (parcelable2 instanceof Intent) {
                                arrayList.set(i, RemoteIntent.fromIntent((Intent) obj2));
                            }
                            i++;
                        }
                    }
                }
                this.a.put(next, obj);
            }
        }
    }

    public RemoteBundle(Parcel parcel) {
        int i = parcel.readInt();
        if (i > 0) {
            HashMap map = new HashMap(i);
            this.a = map;
            parcel.readMap(map, getClass().getClassLoader());
        }
    }
}

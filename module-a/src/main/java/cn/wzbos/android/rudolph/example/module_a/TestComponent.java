package cn.wzbos.android.rudolph.example.module_a;

import android.app.Application;
import android.widget.Toast;

import cn.wzbos.android.rudolph.annotations.Component;
import cn.wzbos.android.rudolph.IRouteTable;

@Component
public class TestComponent implements IRouteTable {

    @Override
    public void init(Application application) {
        Toast.makeText(application.getApplicationContext(), "Module A initialized！", Toast.LENGTH_SHORT).show();
    }
}

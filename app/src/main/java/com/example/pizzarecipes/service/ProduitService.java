package com.example.pizzarecipes.service;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProduitService();
        }
        return INSTANCE;
    }

    private void seed() {
        create(new Produit(
                "BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n" +
                        "- 1/4 teaspoon pepper\n" +
                        "- 1 cup barbecue sauce, divided\n" +
                        "- 1 tube (13.8 ounces) refrigerated pizza crust\n" +
                        "- 2 teaspoons olive oil\n" +
                        "- 2 cups shredded Gouda cheese\n" +
                        "- 1 small red onion, halved and thinly sliced\n" +
                        "- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-moment cookouts and summer dinners on the patio.",
                "STEP 1:\nGriller le poulet.\n\nSTEP 2:\nPréparer la pâte et la griller.\n\nSTEP 3:\nAjouter sauce, fromage, poulet, oignon puis terminer la cuisson."
        ));

        create(new Produit(
                "BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n" +
                        "- 1 prebaked 12-inch pizza crust\n" +
                        "- 1 package (6 ounces) sliced turkey pepperoni\n" +
                        "- 2 cups shredded part-skim mozzarella cheese\n" +
                        "- 1-1/2 cups chopped plum tomatoes\n" +
                        "- 1/2 cup fresh basil leaves\n" +
                        "- 1 tablespoon olive oil\n" +
                        "- 2 garlic cloves, minced",
                "Pizza généreuse avec beaucoup de saveurs italiennes et des tomates fraîches.",
                "STEP 1:\nCuire la saucisse, garnir la pâte avec pepperoni, saucisse et fromage.\n\nSTEP 2:\nPréparer le mélange tomates-basilic puis l’ajouter après cuisson."
        ));

        create(new Produit(
                "SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min",
                "- 1 package pizza crust mix\n" +
                        "- 1/2 cup Alfredo sauce\n" +
                        "- 2 medium tomatoes\n" +
                        "- 4 cups chopped fresh spinach\n" +
                        "- 2 cups shredded Italian cheese blend",
                "Pizza légère, crémeuse et riche en légumes.",
                "STEP 1:\nPréparer la pâte.\n\nSTEP 2:\nAjouter sauce, tomates, épinards et fromage.\n\nSTEP 3:\nCuire jusqu’à ce que le fromage fonde."
        ));

        create(new Produit(
                "DEEP-DISH SAUSAGE PIZZA", 8, R.mipmap.pizza4, "45 min",
                "- 1 package active dry yeast\n" +
                        "- 2/3 cup warm water\n" +
                        "- 1-3/4 to 2 cups all-purpose flour\n" +
                        "- 1/4 cup vegetable oil\n" +
                        "- oregano, basil, marjoram\n" +
                        "- garlic salt, onion salt",
                "Pizza épaisse de style américain, très copieuse.",
                "STEP 1:\nPréparer et faire lever la pâte.\n\nSTEP 2:\nAjouter les couches de garniture et cuire.\n\nSTEP 3:\nLaisser reposer avant de servir."
        ));

        create(new Produit(
                "HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min",
                "- 1 package active dry yeast\n" +
                        "- 1 teaspoon sugar\n" +
                        "- 1-1/4 cups warm water\n" +
                        "- 1/4 cup canola oil\n" +
                        "- 1 teaspoon salt\n" +
                        "- 3-1/2 cups all-purpose flour\n" +
                        "- 1/2 pound ground beef\n" +
                        "- 1 small onion, chopped\n" +
                        "- tomato sauce, oregano, basil, green pepper, mozzarella",
                "Pizza maison classique, généreuse et familiale.",
                "STEP 1:\nPréparer la pâte.\n\nSTEP 2:\nFaire lever et cuire la viande.\n\nSTEP 3:\nGarnir les pizzas.\n\nSTEP 4:\nCuire jusqu’à dorure."
        ));

        create(new Produit(
                "PESTO CHICKEN PIZZA", 3, R.mipmap.pizza6, "50 min",
                "- yeast, warm water, bread flour\n" +
                        "- olive oil, sugar, salt\n" +
                        "- chicken breasts\n" +
                        "- onion, peppers, mushrooms\n" +
                        "- pesto, mozzarella",
                "Pizza savoureuse au pesto avec poulet et légumes.",
                "STEP 1:\nPréparer la pâte.\n\nSTEP 2:\nFaire lever.\n\nSTEP 3:\nCuire le poulet et les légumes.\n\nSTEP 4:\nGarnir avec pesto et fromage.\n\nSTEP 5:\nCuire."
        ));

        create(new Produit(
                "LOADED MEXICAN PIZZA", 3, R.mipmap.pizza7, "30 min",
                "- black beans\n" +
                        "- red onion\n" +
                        "- yellow pepper\n" +
                        "- chili powder, cumin\n" +
                        "- tomatoes, jalapeno, garlic\n" +
                        "- spinach, cilantro\n" +
                        "- cheddar, pepper jack",
                "Pizza d’inspiration mexicaine, épicée et originale.",
                "STEP 1:\nPréparer la purée de haricots et le mélange tomate-jalapeno.\n\nSTEP 2:\nGarnir la pâte.\n\nSTEP 3:\nCuire."
        ));

        create(new Produit(
                "BACON CHEESEBURGER PIZZA", 2, R.mipmap.pizza8, "20 min",
                "- ground beef\n" +
                        "- onion\n" +
                        "- pizza sauce\n" +
                        "- bacon\n" +
                        "- dill pickle slices\n" +
                        "- mozzarella\n" +
                        "- cheddar cheese",
                "Un mélange amusant entre cheeseburger et pizza.",
                "STEP 1:\nCuire le bœuf et l’oignon.\n\nSTEP 2:\nGarnir avec sauce, viande, bacon, cornichons et fromage.\n\nSTEP 3:\nCuire."
        ));

        create(new Produit(
                "PIZZA MARGHERITA", 1, R.mipmap.pizza9, "30 min",
                "- active dry yeast\n" +
                        "- warm water\n" +
                        "- olive oil\n" +
                        "- sugar\n" +
                        "- salt\n" +
                        "- bread flour",
                "Pizza italienne classique aux couleurs du drapeau italien.",
                "STEP 1:\nPréparer la pâte.\n\nSTEP 2:\nLaisser lever.\n\nSTEP 3:\nÉtaler et garnir.\n\nSTEP 4:\nCuire."
        ));

        create(new Produit(
                "PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.mipmap.pizza10, "45 min",
                "- active dry yeast\n" +
                        "- warm water\n" +
                        "- olive oil\n" +
                        "- salt\n" +
                        "- sugar\n" +
                        "- flour",
                "Pizza farcie très riche, parfaite pour un repas copieux.",
                "STEP 1:\nPréparer la pâte.\n\nSTEP 2:\nLaisser lever.\n\nSTEP 3:\nAjouter la garniture.\n\nSTEP 4:\nFermer avec la deuxième pâte.\n\nSTEP 5:\nCuire puis servir."
        ));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}